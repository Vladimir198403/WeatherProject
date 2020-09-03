package com.volodin.weatherprogect;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ChoiceSity extends AppCompatActivity implements Constants {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_sity);

        String[] cities = getResources().getStringArray(R.array.spinnerCity);
        initRecycleView(cities);
    }

    private void initRecycleView(String[] cities) {
        recyclerView = findViewById(R.id.recycler_view_choice_city);

        // Эта установка служит для повышения производительности системы
        recyclerView.setHasFixedSize(true);

        // Будем работать со встроенным менеджером
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //Установим адаптер
        SocnetAdapter adapter = new SocnetAdapter(cities);
        recyclerView.setAdapter(adapter);

//установим слушателя
        adapter.SetOnClickListener(new SocnetAdapter.OnItemClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onItemClick(View v, int position) {

                Toast.makeText(ChoiceSity.this, String.format("%d", position), Toast.LENGTH_SHORT).show();
                final Intent intent = new Intent(ChoiceSity.this, MainActivity.class);
                intent.putExtra(SITY, position);
                Log.d("My tag", "position " + position);
                finish();
                // Toast.makeText(getApplicationContext(), instanceString + " - onCreate()", Toast.LENGTH_SHORT).show();
            }
        });


    }


}