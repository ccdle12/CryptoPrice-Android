package com.example.christophercoverdale.cryptoprice_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Dashboard.PFDashboardPresenter;
import Dashboard.PFDashboardVC;

public class MainActivity extends AppCompatActivity
{

    private PFDashboardVC pfDashboardVC;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initDashboard();
    }

    private void initDashboard()
    {
        this.pfDashboardVC = new PFDashboardVC();

        getFragmentManager().beginTransaction()
                .add(R.id.fragment_container, this.pfDashboardVC)
                .commit();
    }
}
