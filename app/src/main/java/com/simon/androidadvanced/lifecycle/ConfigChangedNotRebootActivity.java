package com.simon.androidadvanced.lifecycle;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

/**
 * @author simon
 */
public class ConfigChangedNotRebootActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_config_change_not_reboot;
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

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged:,newOrientation: "+newConfig.orientation);
    }
}
