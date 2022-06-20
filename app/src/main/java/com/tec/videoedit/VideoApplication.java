package com.tec.videoedit;

import android.app.Application;

import androidx.multidex.MultiDex;


public class VideoApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }

}
