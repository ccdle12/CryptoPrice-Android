package Dagger;

import com.example.christophercoverdale.cryptoprice_android.MainActivity;

import javax.inject.Singleton;

import Dashboard.PFDashboardPresenter;
import Dashboard.PFDashboardVC;
import Managers.PFDataManager;
import dagger.Component;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent
{
    void inject(MainActivity mainActivity);
    void inject(PFDashboardVC dashboardVC);
    void inject(PFDashboardPresenter pFDashboardPresenter);
}
