package com.example.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    int num,num2=0;

    String operation;
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void three(View view) {
        String s = txt.getText().toString();
        s = s+"3";
        txt.setText(s);
    }

    public void one(View view) {
        String s = txt.getText().toString();
        s = s+"1";
        txt.setText(s);
    }
    public void two(View view) {
        String s = txt.getText().toString();
        s =s+"2";
        txt.setText(s);
    }

    public void five(View view) {
        String s = txt.getText().toString();
        s =s+"5";
        txt.setText(s);
    }

    public void four(View view) {
        String s = txt.getText().toString();
        s =s+"4";
        txt.setText(s);
    }

    public void six(View view) {
        String s = txt.getText().toString();
        s =s+"6";
        txt.setText(s);
    }

    public void seven(View view) {
        String s = txt.getText().toString();
        s =s+"7";
        txt.setText(s);
    }

    public void eight(View view) {
        String s = txt.getText().toString();
        s =s+"8";
        txt.setText(s);
    }

    public void nine(View view) {
        String s = txt.getText().toString();
        s =s+"9";
        txt.setText(s);
    }

    public void zero(View view) {
        String s = txt.getText().toString();
        s =s+"0";
        txt.setText(s);
    }
}