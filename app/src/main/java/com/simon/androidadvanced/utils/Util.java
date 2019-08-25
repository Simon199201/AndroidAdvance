package com.simon.androidadvanced.utils;

import android.content.Context;
import android.content.Intent;

public class Util {
    public static void startActivity(Context context,Class className){
        Intent intent = new Intent();
        intent.setClass(context, className);
        context.startActivity(intent);
    }
}
