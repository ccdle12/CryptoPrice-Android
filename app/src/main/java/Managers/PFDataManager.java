package Managers;

import java.util.ArrayList;

import javax.inject.Inject;

import CustomClasses.Exchanges.Exchange;
import CustomClasses.Exchanges.ExchangeDelegate;
import CustomClasses.Exchanges.ExchangesGraph;
import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;
import Dashboard.PFDashboardPresenter;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class PFDataManager implements ExchangeDelegate
{

    public @Inject ExchangesGraph exchangesGraph;


    /** Dashboard Presenter Delegate Interface **/
    public interface PFDashboardPresenterDelegate
    {

    }


    /** Member Variables **/
    private PFDashboardPresenter pfDashboardPresenterDelegate;




    /** Setup and Constructor Methods **/
    public PFDataManager()
    {
        this.injectDependencies();
    }

    private void injectDependencies()
    {
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();

        appComponent.inject(this);
    }




    /** Method call from PFDashboardPresenter **/
    public void setPFDashboardPresenterDelegate(PFDashboardPresenter pfDashboardPresenter)
    {
        this.pfDashboardPresenterDelegate = pfDashboardPresenter;
    }



    /** Calls to update prices **/
    public void updateAllPrices()
    {
        ArrayList<Exchange> exchangeArrayList = ExchangesGraph.exchangesArrayList;

        for (Exchange eachExchange : exchangeArrayList)
        {
            for (int i = 0; i < eachExchange.coinCount; i++)
                getUpdatedPrice(eachExchange.exchangeName, i);
        }
    }

    public void getUpdatedPrice(String exchange, int coinID)
    {
        Exchange requestedExchange = this.exchangesGraph.getExchange(exchange);
        requestedExchange.setDelegate(this);
        requestedExchange.exchangeUpdatePrice(exchange, coinID);
    }

    @Override
    public void exchangeStateHasChanged(String exchange, int coinID)
    {
        Exchange requestedExchange = this.exchangesGraph.getExchange(exchange);

        System.out.println("Coin that was updated: " + requestedExchange.coins.get(coinID).ticker);
        System.out.println("Callback coin price: " + requestedExchange.coins.get(coinID).USDPrice);
    }
}
