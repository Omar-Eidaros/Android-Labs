package com.android.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String email = intent.getExtras().getString(MainActivity.USER_NAME_KEY);

        Toast.makeText(getApplicationContext(),"Hello "+email+" from the intent",Toast.LENGTH_LONG).show();
    }
    public void closeFun()
    {
        this.finish();
    }
}