package Managers;

import javax.inject.Inject;

import CustomClasses.Exchanges.Exchange;
import CustomClasses.Exchanges.ExchangesGraph;
import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;
import Dashboard.PFDashboardPresenter;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class PFDataManager
{
    public @Inject ExchangesGraph exchangesGraph;

    /** Delegate Interface **/
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



    /** Testing the updating price methods **/
    public void updateAllPrices()
    {

    }

    public void getUpdatedPrice(String exchange, int coinID)
    {
        Exchange requestedExchange = this.exchangesGraph.getExchange(exchange);
        String tempTestResponse = requestedExchange.getUpdatedPrice(coinID);
    }
}
