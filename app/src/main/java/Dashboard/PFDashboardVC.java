package Dashboard;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.christophercoverdale.cryptoprice_android.R;

import javax.inject.Inject;

import Dagger.AppComponent;
import Dagger.AppModule;
import Dagger.DaggerAppComponent;

/**
 * Created by christophercoverdale on 02/11/2017.
 */

public class PFDashboardVC extends Fragment implements PFDashboardPresenter.PFDashboardVCDelegate
{
    public @Inject PFDashboardPresenter pfDashboardPresenter;

    /** Setup and Constructor Methods **/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.dashboard, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        this.injectDependencies();
        this.setPfDashboardPresenterDelegate();
    }

    private void injectDependencies()
    {
        AppComponent appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule())
                .build();

        appComponent.inject(this);
    }

    private void setPfDashboardPresenterDelegate()
    {
        this.pfDashboardPresenter.setPFDashboardVCDelegate(this);
    }
}
