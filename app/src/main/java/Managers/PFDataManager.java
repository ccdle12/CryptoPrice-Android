package Managers;

import android.util.Log;

import Dashboard.PFDashboardPresenter;

import static android.content.ContentValues.TAG;

/**
 * Created by christophercoverdale on 03/11/2017.
 */

public class PFDataManager
{
    /** Delegate Interface **/
    public interface PFDashboardPresenterDelegate
    {

    }



    /** Setup and Constructor Methods **/
    private PFDashboardPresenter pfDashboardPresenterDelegate;

    public PFDataManager()
    {

    }



    /** Method call from PFDashboardPresenter **/
    public void setPFDashboardPresenterDelegate(PFDashboardPresenter pfDashboardPresenter)
    {
        this.pfDashboardPresenterDelegate = pfDashboardPresenter;
    }
}
