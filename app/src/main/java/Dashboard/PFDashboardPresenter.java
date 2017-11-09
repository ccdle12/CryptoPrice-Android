package Dashboard;

import javax.inject.Inject;

import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;
import Managers.PFDataManager;

/**
 * Created by christophercoverdale on 02/11/2017.
 */

public class PFDashboardPresenter
{
    /** Delegate Interface **/
    public interface PFDashboardVCDelegate
    {

    }



    /** Member Variables **/
    private PFDashboardVCDelegate pfDashboardVCDelegate;
    @Inject PFDataManager pfDataManager;





    /** Setup and Constructor Methods **/
    public PFDashboardPresenter()
    {
        this.injectDependencies();
        this.setPfDataManagerDelegate();

        //TODO: Testing network utils works
//        this.pfDataManager.getUpdatedPrice("Coinbase", 0);
        this.pfDataManager.updateAllExchangePrices();
    }

    private void injectDependencies()
    {
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();

        appComponent.inject(this);
    }

    private void setPfDataManagerDelegate()
    {
        this.pfDataManager.setPFDashboardPresenterDelegate(this);
    }




    /** Method call from VC **/
    public void setPFDashboardVCDelegate(PFDashboardVC pfDashboardVC)
    {
        this.pfDashboardVCDelegate = pfDashboardVC;
    }


}
