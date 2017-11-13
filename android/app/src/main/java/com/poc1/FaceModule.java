package com.poc1;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.daon.fido.client.sdk.core.Error;
import com.daon.fido.client.sdk.core.FidoSdkFactory;
import com.daon.fido.client.sdk.core.IFidoSdk;
import com.daon.fido.client.sdk.core.IUafInitialiseCallback;
import com.daon.sdk.authenticator.capture.CaptureFragment;
import com.daon.sdk.faceauthenticator.capture.RegisterFaceFragment;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by pdesai4 on 11/6/17.
 */

public class FaceModule extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener, CaptureFragment.CaptureCallback {

    public FaceModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {

    }

    @ReactMethod
    public void loadFragment() {
        final Activity activity = getCurrentActivity();
        Bundle parameters = new Bundle();
        parameters.putString("com.daon.sdk.log","true");
        try {
            IFidoSdk sdk = FidoSdkFactory.getFidoSdk(activity);
            sdk.initialise(parameters, new IUafInitialiseCallback() {
                @Override
                public void onUafInitialiseComplete() {
                    try {
                        BlankFragment fragment = new BlankFragment();
                        /* Daon Face Fragment */
//                      RegisterFaceFragment fragment = new RegisterFaceFragment();
                        FragmentTransaction transaction = activity.getFragmentManager().beginTransaction();
                        transaction.replace(R.id.daonView, fragment);
                        transaction.commit();
                    } catch (Exception e) {
                        Log.i("Pranjal", e.toString());
                    }
                }

                @Override
                public void onUafInitialiseFailed(int code, String message) {
                    Log.i("Pranjal", message);
                }
            });
        }catch (Exception e){
            Log.i("Pranjal",e.toString());
        }
    }

    public void initialize(){

    }


    @Override
    public void onNewIntent(Intent intent) {

    }

    @Override
    public void onHostResume() {

    }

    @Override
    public void onHostPause() {

    }

    @Override
    public void onHostDestroy() {

    }

    @Override
    public String getName() {
        return "FaceModule";
    }

    @Override
    public void onCaptureComplete(Bundle bundle) {
        Log.i("Pranjal", "Success");
    }

    @Override
    public void onCaptureFailed(Bundle bundle, int i, String s) {
        Log.i("Pranjal", "Failed");
    }
}
