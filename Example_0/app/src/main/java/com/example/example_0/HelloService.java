package com.example.example_0;

import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;

public class HelloService extends Service {
    int mStartMode;
    IBinder mBinder;

    boolean mAllowRebind;

    // The service is starting, due to a call to startService()
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mStartMode;
    }

    // A client is binding to the service with bindService()
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    // Called when all clients have unbound with unbindService()
    @Override
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }
}
