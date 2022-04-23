package com.android.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifeCycle","On Create Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifeCycle","On Start Method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifeCycle","On Resume Method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifeCycle","On Restart Method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifeCycle","On Pause Method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifeCycle","On Stop Method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifeCycle","On Destroy Method");
    }
}