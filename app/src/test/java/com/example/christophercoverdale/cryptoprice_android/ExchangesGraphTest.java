package com.example.christophercoverdale.cryptoprice_android;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import CustomClasses.Exchanges.ExchangesGraph;
import Dashboard.PFDashboardPresenter;

import static org.junit.Assert.*;

/**
 * Created by christophercoverdale on 03/11/2017.
 */
public class ExchangesGraphTest
{
    ExchangesGraph exchangesGraph;

    @Before
    public void setUp()
    {
        this.exchangesGraph = ExchangesGraph.instanceOfExchangesGraph();
    }

    @Test
    public void objectIsNotNull()
    {
        Assert.assertTrue(this.exchangesGraph != null);
    }
}