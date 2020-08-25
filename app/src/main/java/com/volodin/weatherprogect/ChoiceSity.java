package com.volodin.weatherprogect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class ChoiceSity extends AppCompatActivity implements Constants {

    String[] city = {"Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Нижний Новгород", "Казань", "Челябинск", "Омск", "Самара",
            "Ростов-на-Дону", "Уфа", "Красноярск", "Воронеж", "Пермь", "Волгоград"};

    Button choiceCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_sity);

        AutoCompleteTextView cityArray = (AutoCompleteTextView) findViewById(R.id.sityArr);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, city);
        cityArray.setAdapter(adapter);
    }

    public void ChoiseCity(View view) {
        choiceCity = (Button)findViewById(R.id.buttonChoiseCity);
        choiceCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AutoCompleteTextView txt = ChoiceSity.this.findViewById(R.id.sityArr);
                Intent intent = new Intent(ChoiceSity.this,MainActivity.class);
                intent.putExtra(SITY, txt.getText().toString());
                startActivity(intent);
            }
        });
    }
}