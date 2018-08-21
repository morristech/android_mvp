package com.nerdscorner.mvplib.events.view;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.nerdscorner.mvplib.commons.mvp.view.BaseView;

import org.greenrobot.eventbus.EventBus;

import java.lang.ref.WeakReference;

public abstract class BaseActivityView extends BaseView {

    private WeakReference<AppCompatActivity> activityRef;
    protected final EventBus bus;

    public BaseActivityView(@NonNull AppCompatActivity activity) {
        activityRef = new WeakReference<>(activity);
        bus = EventBus.getDefault();
    }

    @Nullable
    @Override
    public AppCompatActivity getActivity() {
        return activityRef.get();
    }

    @Nullable
    public FragmentManager getFragmentManager() {
        AppCompatActivity activity = getActivity();
        return activity != null ? activity.getSupportFragmentManager() : null;
    }

    public void onDestroy() {
    }
}
