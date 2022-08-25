package com.example.userlogin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    String default_username = "fathima";
    String default_password = "nazar";

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   
    public void validateLogin(View v) {
        EditText username = (EditText) findViewById(R.id.user_name);
        EditText password = (EditText) findViewById(R.id.pass_word);
        EditText emailaddress = (EditText) findViewById(R.id.email_address);

        String user_name = username.getText().toString();
        String pass_word = password.getText().toString();
        String email_address = emailaddress.getText().toString();

        String message = "Invalid credentials";
        if(user_name.equals(default_username) && pass_word.equals(default_password)) {
            message = "Login successfull";
            Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

            sp = getSharedPreferences("UserInfo",MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();

            editor.putString("user_name",user_name);
            editor.putString("email_address",email_address);
            editor.commit();


            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);

        }


        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();

    }


}