package com.nerdscorner.mvplib.testapp.interfaces.attribute.presenter;

import com.nerdscorner.mvplib.interfaces.presenter.BaseActivityPresenter;
import com.nerdscorner.mvplib.testapp.interfaces.attribute.model.AttributeMainModelInterface;
import com.nerdscorner.mvplib.testapp.interfaces.attribute.view.AttributeMainViewInterface;

public class AttributeMainPresenter extends BaseActivityPresenter<AttributeMainViewInterface, AttributeMainModelInterface> implements AttributeMainPresenterInterface {

    public AttributeMainPresenter(AttributeMainViewInterface view, AttributeMainModelInterface model) {
        super(view, model);
    }

    @Override
    public void onActionClicked() {
        view.setTextValue("Executing background task...");
        model.doSomethingInBackground();
    }

    @Override
    public void onBackgroundTaskCompleted() {
        view.setTextValue("Background task completed");
    }
}