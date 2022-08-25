package com.example.passwordvalidation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    String default_username = "fathima";
    String default_password = "nazar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button loginBtn = (Button) findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateLogin();
            }
        });
    }

    private void validateLogin() {
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);

        String user_name = username.getText().toString();
        String pass_word = password.getText().toString();

        String message = "Invalid credentials";
        if(user_name.equals(default_username) && pass_word.equals(default_password))
            message = "Login successfull";

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();


    }


}
