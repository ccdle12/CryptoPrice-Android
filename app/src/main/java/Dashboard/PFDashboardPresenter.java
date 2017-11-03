package Dashboard;

import android.util.Log;

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
