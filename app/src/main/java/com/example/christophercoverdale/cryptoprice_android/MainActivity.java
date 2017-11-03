package com.example.christophercoverdale.cryptoprice_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;
import Dashboard.PFDashboardPresenter;
import Dashboard.PFDashboardVC;

public class MainActivity extends AppCompatActivity
{

    public @Inject PFDashboardVC pfDashboardVC;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.injectDependecies();
        this.initDashboard();
    }

    private void initDashboard()
    {

        getFragmentManager().beginTransaction()
                .add(R.id.fragment_container, this.pfDashboardVC)
                .commit();
    }

    private void injectDependecies()
    {
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();

        appComponent.inject(this);
    }
}
