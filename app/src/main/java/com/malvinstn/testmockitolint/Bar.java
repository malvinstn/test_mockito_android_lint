package com.malvinstn.testmockitolint;

import android.util.Log;

class Bar {
    private static final String TAG = Bar.class.getName();

    int bar() {
        Log.d(TAG, "bar");
        return 1;
    }
}
