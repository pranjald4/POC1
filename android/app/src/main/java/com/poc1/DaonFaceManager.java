package com.poc1;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.daon.sdk.faceauthenticator.capture.RegisterFaceFragment;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pdesai4 on 11/6/17.
 */

public class DaonFaceManager extends SimpleViewManager<FrameLayout> {

    @Override
    public String getName() {
        return "DaonFaceManager";
    }

    @Override
    protected FrameLayout createViewInstance(ThemedReactContext reactContext) {

        return (FrameLayout) LayoutInflater.from(reactContext).inflate(R.layout.daonfacelayout, null);
    }
}
