package com.xcheng.view.callback;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * 全局 Activity和Fragment 生命周期监听
 * Created by chengxin on 2017/9/29.
 */
public class GlobalLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks implements ActivityLifecycleCallbacks {
    static String TAG = "GlobalLifecycleCallbacks";

    @CallSuper
    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        if (activity instanceof FragmentActivity) {
            //此处为Fragment注册生命周期，并且只有一个监听实例
            ((FragmentActivity) activity).getSupportFragmentManager()
                    .registerFragmentLifecycleCallbacks(this, true);
        }
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
