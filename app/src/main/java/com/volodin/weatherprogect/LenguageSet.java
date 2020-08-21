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

public class LenguageSet extends AppCompatActivity {

    Button lenChoose;
    @SuppressLint("ResourceType")
    private String chooseLen = getString(R.id.textViewLen3);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenguage_set);
    }

    public void selectLenguage(View view){
        TextView textViewLen3 = (TextView)findViewById(R.id.textViewLen3);
        Spinner spinnerLen = (Spinner)findViewById(R.id.spinnerLen);
        String lenguage = String.valueOf(spinnerLen.getSelectedItem());
        textViewLen3.setText(lenguage);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStart активити настроек ");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestoreInstanceState активити настроек языка ");
        chooseLen = savedInstanceState.getString("Lenguage");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPostResume активити настроек языка ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onPause активити настроек языка ");
    }

    @Override
    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onSaveInstanceState активити настроек языка ");
        saveInstanceState.putString("Lenguage", chooseLen);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onStop активити настроек языка");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onRestart активити настроек языка ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.d("My tag", "onDestroy активити настроек языка ");
    }
}