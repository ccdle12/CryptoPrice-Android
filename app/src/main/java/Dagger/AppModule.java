package Dagger;

import javax.inject.Singleton;

import CustomClasses.Coins.Bitcoin;
import CustomClasses.Exchanges.ExchangesGraph;
import Dashboard.PFDashboardPresenter;
import Dashboard.PFDashboardVC;
import Managers.PFDataManager;
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
    @Singleton
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

    @Provides
    @Singleton
    public PFDataManager providesPFDataManager() { return new PFDataManager(); }

    @Provides
    public Bitcoin providesBitcoin()
    {
        return new Bitcoin();
    }

    @Provides
    @Singleton
    public ExchangesGraph providesExchangesGraph()
    {
        return ExchangesGraph.instanceOfExchangesGraph();
    }
}
