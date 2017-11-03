package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Coins.Bitcoin;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class BitcoinTest
{
    Bitcoin bitcoin;

    @Before
    public void setUpBitcoinObject()
    {
        this.bitcoin = new Bitcoin();
    }

    @Test
    public void bitcoinIsNotNull()
    {
        Assert.assertTrue(this.bitcoin != null);
    }

    @Test
    public void bitcoinIdShouldEqualZero()
    {
        Assert.assertEquals(0, this.bitcoin.id);
    }

    @Test
    public void canAccessBitcoinPrice()
    {
        Assert.assertEquals(-1.0, this.bitcoin.USDPrice);
    }

    @Test
    public void canChangeBitcoinPrice()
    {
        this.bitcoin.USDPrice = 7000;
        Assert.assertEquals(7000.0, this.bitcoin.USDPrice);
    }

    @Test
    public void canGetBTCTicker()
    {
        Assert.assertEquals("BTC", this.bitcoin.ticker);
    }
}