package com.example.lesson23oneactivitystate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"MainActivity: onCreate()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"MainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"MainActivity: onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"MainActivity: onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity: onStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"MainActivity: onStart()");
    }
}
