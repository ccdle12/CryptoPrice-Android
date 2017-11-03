package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Exchanges.Coinbase;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class CoinbaseTest
{
    Coinbase coinbase;

    @Before
    public void setUpObject()
    {
        this.coinbase = new Coinbase();
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


}