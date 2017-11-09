package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Coins.CryptoCurrency;
import CustomClasses.Exchanges.Coinbase;
import Managers.PFDataManager;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class CoinbaseTest
{
    PFDataManager pfDataManager;
    Coinbase coinbase;

    @Before
    public void setUpObject()
    {
        this.pfDataManager = new PFDataManager();
        this.coinbase = new Coinbase();

        this.coinbase.setDelegate(this.pfDataManager);
    }

    @Test
    public void coinbaseIsNotNull()
    {
        Assert.assertTrue(this.coinbase != null);
    }

    @Test
    public void canAccessBitcoinPrice()
    {
        Assert.assertEquals(-1.0, this.coinbase.bitcoin.USDPrice);
    }

    @Test
    public void retrievingDataCorrectly()
    {
        this.coinbase.exchangeUpdatePrice("Coinbase", 0);

        CryptoCurrency updatedCoin = this.coinbase.coins.get(0);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        Assert.assertTrue(updatedCoin.USDPrice > 0);
    }

    @Test
    public void sizeOfCoinCount()
    {
        Assert.assertTrue(coinbase.coinCount == coinbase.coins.size());
    }


}