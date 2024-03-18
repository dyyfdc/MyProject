package com.dji.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * author:duyuyang
 * date:2024.03.19
 */
public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        com.secneo.sdk.Helper.install(this);
    }

}