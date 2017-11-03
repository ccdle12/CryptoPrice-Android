package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Bitcoin;
import Dashboard.PFDashboardPresenter;
import Managers.PFDataManager;

import static org.junit.Assert.*;

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