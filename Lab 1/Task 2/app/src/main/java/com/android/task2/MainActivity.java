package com.android.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login_btn,close_btn;
    EditText usrname,pass;
    public static final String  USER_NAME_KEY = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname = findViewById(R.id.username_edit);
        pass = findViewById(R.id.password_edit);
        login_btn = findViewById(R.id.login_btn);
        close_btn = findViewById(R.id.close_btn);

        // final String mail = usrname.getText().toString();
        // final String password = pass.getText().toString();

        login_btn.setOnClickListener(view -> {

            if(pass.getText().toString().equals("123"))
            {
                if(usrname.getText().toString().length() == 0)
                {
                    usrname.requestFocus();
                    usrname.setError("Falied Cann't be Empty !");
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                    goToActivity2();

                }
            }
            else
            {
                pass.requestFocus();
                pass.setError("Wrong Password");
            }
        });

    }

    protected void goToActivity2 ()
    {
        String mail = usrname.getText().toString();
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        intent.putExtra(USER_NAME_KEY,mail);
        startActivity(intent);
    }

    protected void closeFun()
    {
        this.finish();
    }
}