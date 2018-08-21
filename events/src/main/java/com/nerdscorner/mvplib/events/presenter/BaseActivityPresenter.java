package com.nerdscorner.mvplib.events.presenter;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.Menu;

import com.nerdscorner.mvplib.commons.mvp.model.BaseModel;
import com.nerdscorner.mvplib.commons.mvp.presenter.BasePresenter;
import com.nerdscorner.mvplib.events.view.BaseActivityView;

public class BaseActivityPresenter<V extends BaseActivityView, M extends BaseModel> extends BasePresenter<V, M> {

    public BaseActivityPresenter(@NonNull V view, @NonNull M model) {
        super(view, model);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
    }
}
