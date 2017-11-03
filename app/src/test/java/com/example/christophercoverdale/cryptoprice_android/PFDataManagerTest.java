package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Managers.PFDataManager;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class PFDataManagerTest
{
    PFDataManager pfDataManager;

    @Before
    public void setUpObject()
    {
        this.pfDataManager = new PFDataManager();
    }

    @Test
    public void coinbaseIsNotNull()
    {
        Assert.assertTrue(this.pfDataManager != null);
    }

    @Test
    public void exhangesGraphIsInjected()
    {
        Assert.assertTrue(this.pfDataManager.exchangesGraph != null);
    }
}