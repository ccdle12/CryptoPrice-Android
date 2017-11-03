package Dashboard;

import android.util.Log;

/**
 * Created by christophercoverdale on 02/11/2017.
 */

public class PFDashboardPresenter
{
    public interface PFDashboardVCDelegate
    {

    }

    private PFDashboardVCDelegate pfDashboardVCDelegate;



    public PFDashboardPresenter()
    {

    }

    public void setPFDashboardVCDelegate(PFDashboardVC pfDashboardVC)
    {
        this.pfDashboardVCDelegate = pfDashboardVC;
    }
}
