package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import CustomClasses.Exchanges.Exchange;
import CustomClasses.Exchanges.ExchangesGraph;
import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;
import Managers.PFDataManager;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class PFDataManagerTest
{
    public @Inject PFDataManager pfDataManager;
    public @Inject ExchangesGraph exchangesGraph;

    @Before
    public void setUpObject()
    {
        this.pfDataManager = new PFDataManager();
        this.exchangesGraph = ExchangesGraph.instanceOfExchangesGraph();
    }

    @Test
    public void coinbaseIsNotNull()
    {
        Assert.assertTrue(this.pfDataManager != null);
    }

    @Test
    public void exchangesGraphIsInjected()
    {
        Assert.assertTrue(this.pfDataManager.exchangesGraph != null);
    }

    @Test
    public void pricesOnExchangeHasBeenUpdatedOnCoinbase()
    {
        Exchange coinbase = exchangesGraph.getExchange("Coinbase");
        double prevUSDPrice = coinbase.bitcoin.USDPrice;

        pfDataManager.updatePricesOnExchange(coinbase.exchangeName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double updatedUSDPrice = coinbase.bitcoin.USDPrice;
        Assert.assertTrue(prevUSDPrice != updatedUSDPrice);
    }

    @Test
    public void nonExistentExchangeIsNullAndMakesNoHTTPRequest()
    {
        Exchange coinbase = exchangesGraph.getExchange("blaaah");

        pfDataManager.updatePricesOnExchange("blaaah");

        Assert.assertTrue(coinbase == null);
    }
}