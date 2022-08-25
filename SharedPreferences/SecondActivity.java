package com.example.userlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button logout = (Button) findViewById(R.id.logout);


        sp = getSharedPreferences("UserInfo",MODE_PRIVATE);

        TextView username = (TextView) findViewById(R.id.user_name);
        TextView emailaddress = (TextView) findViewById(R.id.email_address);

        String user_name = sp.getString("user_name","");
        String email_address = sp.getString("email_address","");

        username.setText(user_name);
        emailaddress.setText(email_address);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}