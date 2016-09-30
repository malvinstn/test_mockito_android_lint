package com.malvinstn.testmockitolint;

import android.util.Log;

public class Bar3 {
    private static final String TAG = Bar3.class.getName();

    protected int bar() {
        Log.d(TAG, "bar");
        return 3;
    }
}
