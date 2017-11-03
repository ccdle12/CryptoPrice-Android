package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Dashboard.PFDashboardPresenter;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class PFDashboardPresenterTest
{
    PFDashboardPresenter pfDashboardPresenter;

    @Before
    public void setUp()
    {
        this.pfDashboardPresenter = new PFDashboardPresenter();
    }

    @Test
    public void objectIsNotNull()
    {
        Assert.assertTrue(this.pfDashboardPresenter != null);
    }


}