package Dashboard;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.christophercoverdale.cryptoprice_android.R;

/**
 * Created by christophercoverdale on 02/11/2017.
 */

public class PFDashboardVC extends Fragment
{
    final String TAG = "CRC";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.dashboard, container, false);
        return view;
    }
}
