package com.android.pride;

import android.content.Context;

public interface AppFilter {

    boolean shouldShowApp(String packageName, Context context);
}
