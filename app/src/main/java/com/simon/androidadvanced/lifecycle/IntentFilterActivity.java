package com.simon.androidadvanced.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.OnClick;

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
}
