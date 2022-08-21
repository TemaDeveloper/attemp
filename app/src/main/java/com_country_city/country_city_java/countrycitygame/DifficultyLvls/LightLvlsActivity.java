package com_country_city.country_city_java.countrycitygame.DifficultyLvls;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Adapters.AdapterLightLvl;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemLvl;
import com_country_city.country_city_java.countrycitygame.R;

public class LightLvlsActivity extends AppCompatActivity implements buildRecyclerView, View.OnClickListener {

    private RecyclerView recyclerViewLightLvls;
    private AdapterLightLvl adapterLightLvl;
    private ArrayList<ItemLvl> lvls;

    private FloatingActionButton floatingActionButtonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_lvls);

        init();

    }

    private void init() {
        recyclerViewLightLvls = findViewById(R.id.recyclerView_light_lvls);
        floatingActionButtonBack = findViewById(R.id.fab_back);
        buildRecyclerView();
        setNewArrayList();
        buildArrayList();
        setNewAdapter();
        floatingActionButtonBack.setOnClickListener(this);
    }

    @Override
    public void buildArrayList() {
        lvls.add(new ItemLvl(R.drawable.img_ordinary_person_to_sholders, "Ordinary Person", "1/10"));
        lvls.add(new ItemLvl(R.drawable.img_teacher_to_sholders, "Teacher", "2/10"));
        lvls.add(new ItemLvl(R.drawable.img_voyager_to_sholders, "Voyager", "0/10"));
        lvls.add(new ItemLvl(R.drawable.img_businesman_to_sholders, "Businessman", "0/10"));
        lvls.add(new ItemLvl(R.drawable.img_knighter_to_sholders, "Adventurer", "0/10"));
        lvls.add(new ItemLvl(R.drawable.img_alien_to_sholders, "Alien", "0/10"));
    }

    @Override
    public void buildRecyclerView() {
        recyclerViewLightLvls.setHasFixedSize(true);
        recyclerViewLightLvls.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void setNewArrayList() {
        lvls = new ArrayList<>();
    }

    @Override
    public void setNewAdapter() {
        adapterLightLvl = new AdapterLightLvl(getApplicationContext(), lvls);
        recyclerViewLightLvls.setAdapter(adapterLightLvl);
    }

    @Override
    public void onClick(View view) {
        floatingActionButtonBack.setOnClickListener(value -> onBackPressed());
    }
}