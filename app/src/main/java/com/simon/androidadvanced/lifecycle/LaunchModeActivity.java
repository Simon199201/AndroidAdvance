package com.simon.androidadvanced.lifecycle;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

/**
 * @author simon
 */
public class LaunchModeActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_transparent;
    }

}
