package com.volodin.weatherprogect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class LenguageSet extends AppCompatActivity implements Constants {


    Button lenChoose;

//    @SuppressLint("ResourceType")
//    private final String setLen = (String) getText(R.id.textViewLen3);

    private TextView chooseLeng;
    private String txt;
    private String lenguage;
    Spinner spinnerLen;
    TextView textViewLen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenguage_set);
        textViewLen3 = (TextView) findViewById(R.id.textViewLen3);
        spinnerLen = (Spinner) findViewById(R.id.spinnerLen);
        String instanceString;
        if (savedInstanceState == null) {
            instanceString = "Первый запуск";
            Log.d("My tag", "первый запуск активити настройки ");
        } else {
            instanceString = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceString + " - onCreate()", Toast.LENGTH_SHORT).show();
    }

    public void selectLenguage(View view) {
        lenguage = String.valueOf(spinnerLen.getSelectedItem());
        textViewLen3.setText(lenguage);
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onSaveInstanceState активити настроек ");
        txt = lenguage;
        outState.putString(LENG, txt);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestoreInstanceState активити настроек ");
        txt = savedInstanceState.getString(LENG);
        textViewLen3.setText(txt);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStart активити настроек ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPostResume активити настроек ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPause активити настроек ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStop активити настроек ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestart активити настроек ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onDestroy активити настроек ");
    }
}