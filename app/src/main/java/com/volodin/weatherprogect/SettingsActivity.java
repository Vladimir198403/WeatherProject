package com.volodin.weatherprogect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    Button toWeather;
    Button toLenguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        String instanceString;
        if (savedInstanceState == null) {
            instanceString = "Первый запуск";
            Log.d("My tag", "первый запуск активити настройки ");
        } else {
            instanceString = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceString + " - onCreate()", Toast.LENGTH_SHORT).show();
    }

    private void setBtn() {
        toWeather = (Button) findViewById(R.id.settings);
        toWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toWeather(view);
            }
        });
    }

    private void setLen() {
        toLenguage = (Button) findViewById(R.id.setLanguage);
        toLenguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToLenguage(view);
            }
        });
    }


    public void toWeather(View view) {
        startActivity(new Intent(SettingsActivity.this, MainActivity.class));
    }

    public void ToLenguage(View view) {
        startActivity(new Intent(SettingsActivity.this, LenguageSet.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStart активити настроек ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestoreInstanceState активити настроек ");
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
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onSaveInstanceState активити настроек ");
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