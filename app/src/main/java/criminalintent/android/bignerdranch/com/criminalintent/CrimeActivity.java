package criminalintent.android.bignerdranch.com.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends SingleFragmentActivity {
    private static final String TAG = "CrimeActivity";

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
