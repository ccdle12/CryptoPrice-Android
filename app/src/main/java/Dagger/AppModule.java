package Dagger;

import javax.inject.Singleton;

import Dashboard.PFDashboardPresenter;
import Dashboard.PFDashboardVC;
import dagger.Module;
import dagger.Provides;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

@Module
public class AppModule
{
    public AppModule() {};

    @Provides
    public PFDashboardPresenter providePFDashboardPresenter()
    {
        return new PFDashboardPresenter();
    }

    @Provides
    @Singleton
    public PFDashboardVC providesPFDashboardVC()
    {
        return new PFDashboardVC();
    }
}
