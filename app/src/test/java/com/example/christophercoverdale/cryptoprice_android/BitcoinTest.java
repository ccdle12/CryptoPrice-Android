package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Bitcoin;

import static org.junit.Assert.*;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class BitcoinTest
{
    Bitcoin bitcoin;

    @Before
    public void setUpBitcoinObject()
    {
        this.bitcoin = new Bitcoin(6340.84);
    }

    @Test
    public void bitcoinIsNotNull()
    {
        Assert.assertTrue(this.bitcoin != null);
    }
}