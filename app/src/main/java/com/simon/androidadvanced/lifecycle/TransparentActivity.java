package com.simon.androidadvanced.lifecycle;

import android.os.Bundle;
import android.view.WindowManager;

import com.simon.androidadvanced.R;
import com.simon.androidadvanced.common.BaseActivity;

import androidx.annotation.Nullable;

/**
 * @author simon
 */
public class TransparentActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();

        attributes.dimAmount = 0.0f; //设置窗口之外部分透明程度
        attributes.x = 0;
        attributes.y = 0;
        attributes.width = 800;
        attributes.height = 1024;
        getWindow().setAttributes(attributes);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_transparent;
    }

}
