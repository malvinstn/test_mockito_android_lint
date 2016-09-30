package com.malvinstn.testmockitolint;

import android.util.Log;

public class Bar2 {
    private static final String TAG = Bar2.class.getName();

    int bar() {
        Log.d(TAG, "bar");
        return 2;
    }
}
