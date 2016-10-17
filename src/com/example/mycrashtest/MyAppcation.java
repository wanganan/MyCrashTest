package com.example.mycrashtest;

import android.app.Application;

public class MyAppcation extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler.getInstance().init(this);
	}

}
