package com.example.average;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

 EditText Name,Mark1,Mark2,Mark3;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 }

 public void Calculate(View view) {
 String full_name;
 int m1,m2,m3,percentage;

 Name =(EditText) findViewById(R.id.name);
 Mark1 = (EditText) findViewById(R.id.mark1);
 Mark2 = (EditText) findViewById(R.id.mark2);
 Mark3 = (EditText) findViewById(R.id.mark3);

 // Integer.parseInt(String)

 full_name = Name.getText().toString();
 m1 =Integer.parseInt(Mark1.getText().toString());
 m2 = Integer.parseInt(Mark2.getText().toString());
 m3 = Integer.parseInt(Mark3.getText().toString());

 percentage =(m1 + m2 + m3)/3;


 String message = (percentage > 50) ? "You have passed "+full_name : "You have failed "+full_name;


 SharedPreferences sp = getSharedPreferences("Marks",MODE_PRIVATE);
 SharedPreferences.Editor myedit = sp.edit();

 myedit.putString("message",message);
 myedit.putString("name",full_name);
 myedit.putInt("percentage",percentage);
 myedit.commit();


 startActivity(new Intent(this,SecondActivity.class));


 }
}