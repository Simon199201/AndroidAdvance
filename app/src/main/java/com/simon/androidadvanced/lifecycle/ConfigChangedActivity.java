package com.simon.androidadvanced.lifecycle;

import android.os.Bundle;
import android.util.Log;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * @author simon
 */
public class ConfigChangedActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_config_change;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            String test = savedInstanceState.getString("extra_test", "");
            Log.d(TAG, "onCreate: restore extra_test is "+test);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("extra_test", "test");
        Log.d(TAG, "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String test = savedInstanceState.getString("extra_test", "");
        Log.d(TAG, "onRestoreInstanceState: restore extra_test is "+test);

    }
}
