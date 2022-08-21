package com_country_city.country_city_java.countrycitygame.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import com_country_city.country_city_java.countrycitygame.DifficultyLvls.LightLvlsActivity;
import com_country_city.country_city_java.countrycitygame.R;

public class FinishActivity extends AppCompatActivity {

    private MaterialButton btnGoToMenuFromFinish;
    private TextView textScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        btnGoToMenuFromFinish = findViewById(R.id.btn_go_to_menu_from_finish);
        textScore = findViewById(R.id.text_score);

        String score = getIntent().getStringExtra("scoreIntent");
        textScore.setText(score + " / 10");

        btnGoToMenuFromFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}