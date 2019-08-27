package com.simon.androidadvanced;

import butterknife.OnClick;

import android.content.Intent;
import android.net.Uri;

import com.simon.androidadvanced.common.BaseActivity;
import com.simon.androidadvanced.lifecycle.LifeCycleAndLaunchModeActivity;
import com.simon.androidadvanced.utils.Util;

/**
 * @author simon
 */
public class MainActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
    /**
     * 生命周期和启动模式
     */
    @OnClick(R.id.btn_activity_life_cycle_and_start_mode) void startActivity(){
        Util.startActivity(this, LifeCycleAndLaunchModeActivity.class);
    }

    @OnClick(R.id.btn_note) void startStudyNoteLink() {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://shimo.im/mindmaps/yD6qRRGgdDGdxpDj"));
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        startActivity(intent);
    }
}
