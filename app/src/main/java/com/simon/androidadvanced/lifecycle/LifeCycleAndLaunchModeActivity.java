package com.simon.androidadvanced.lifecycle;

import android.os.Bundle;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;
import com.simon.androidadvanced.utils.Util;

import androidx.annotation.Nullable;
import butterknife.OnClick;

/**
 * @author simon
 * 生命周期、启动模式、IntentFilter匹配规则
 */
public class LifeCycleAndLaunchModeActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_life_cycle;
    }

    @OnClick(R.id.btn_start_non_full_activity) void startActivity(){
        Util.startActivity(this,TransparentActivity.class);
    }
    @OnClick(R.id.btn_config_change) void startConfigChangedActivity(){
        Util.startActivity(this,ConfigChangedActivity.class);
    }
    @OnClick(R.id.btn_config_change_not_reboot) void startConfigChangedNotRebootActivity(){
        Util.startActivity(this,ConfigChangedNotRebootActivity.class);
    }
    @OnClick(R.id.btn_launch_mode) void startLaunchModeActivity(){
        Util.startActivity(this,LaunchModeActivity.class);
    }
    @OnClick(R.id.btn_intent_filter) void startIntentFilterActivity(){
        Util.startActivity(this,IntentFilterActivity.class);
    }
}
