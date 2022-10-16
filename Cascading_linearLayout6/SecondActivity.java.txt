package com.example.average;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_second);

 TextView percentage = (TextView) findViewById(R.id.percent);
 TextView result = (TextView) findViewById(R.id.result);

 SharedPreferences sp = getSharedPreferences("Marks",MODE_PRIVATE);

 String message = sp.getString("message","");
 int percent = sp.getInt("percentage",0);
 String percentage_string = percent + "%";

 percentage.setText(percentage_string);
 result.setText(message);

 }
}