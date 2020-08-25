package com.volodin.weatherprogect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements Constants {
    TextView city;
    Button settings;
    Button toChoiceSity;
    String choiceSity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //choiceSity = getIntent().getExtras().getString(SITY);
        city = (TextView) findViewById(R.id.region);
        city.setText(choiceSity);

        String instanceString;
        if (savedInstanceState == null) {
            instanceString = "Первый запуск";
            Log.d("My tag", "первый запуск основное активити ");
        } else {
            instanceString = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceString + " - onCreate()", Toast.LENGTH_SHORT).show();
    }

    private void setBtn() {
        settings = (Button) findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSettings(view);
            }
        });
    }

    private void setToChoiceSity() {
        toChoiceSity = (Button) findViewById(R.id.choosingASity);
        toChoiceSity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toChoiceSity(view);
            }
        });
    }


    public void toSettings(View view) {
        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
    }

    public void toForecast(View view) {
        startActivity(new Intent(MainActivity.this, ForecastActivity.class));
    }

    public void toChoiceSity(View view) {
        startActivity(new Intent(MainActivity.this, ChoiceSity.class));
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStart основное активити ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestoreInstanceState основное активити ");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPostResume основное активити ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPause основное активити ");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onSaveInstanceState основное активити ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStop основное активити ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestart основное активити ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onDestroy основное активити ");
    }
}