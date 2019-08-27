package com.simon.androidadvanced.lifecycle;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

import java.util.List;

import butterknife.OnClick;

import static android.content.pm.PackageManager.MATCH_DEFAULT_ONLY;

/**
 * @author simon
 */
public class IntentFilterActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_intent_filtert;
    }

    @OnClick(R.id.btn_start_by_intent_filter_action) void startIntentFilterByAction(){
        Intent intent = new Intent();
        intent.setAction("com.action.only");
        startActivity(intent);
    }
    @OnClick(R.id.btn_start_by_intent_filter_category) void startIntentFilterByCategory(){
        try {
            Intent intent = new Intent();
            intent.addCategory("com.category.only");
            intent.addCategory("android.intent.category.DEFAULT");
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this,"Intent中的category属性是一个执行Action的附加信息，必须要有一个Action的",Toast.LENGTH_SHORT).show();
        }

    }
    @OnClick(R.id.btn_start_by_intent_filter_data) void startIntentFilterByData(){
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType("text/html");
        startActivity(intent);
    }
    @OnClick(R.id.btn_start_by_three) void startIntentFilterByThree(){
        Intent intent = new Intent("com.action.both_3");
        intent.addCategory("com.category.both_3");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType("text/plain");
        startActivity(intent);
    }
    @OnClick(R.id.btn_start_by_pre) void startIntentPre(){
        Intent intent = new Intent("com.action.both_3");
        intent.addCategory("com.category.both_4");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType("text/plain");
        List<ResolveInfo> list = getPackageManager().queryIntentActivities(intent, MATCH_DEFAULT_ONLY);
        if (list.size() != 0) {
            startActivity(intent);
        } else {
            Toast.makeText(this, getResources().getString(R.string.no_activity), Toast.LENGTH_SHORT).show();
        }
    }
}
