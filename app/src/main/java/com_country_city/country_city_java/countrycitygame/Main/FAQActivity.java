package com_country_city.country_city_java.countrycitygame.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import com_country_city.country_city_java.countrycitygame.Adapters.AdapterFAQ;
import com_country_city.country_city_java.countrycitygame.DifficultyLvls.buildRecyclerView;
import com_country_city.country_city_java.countrycitygame.Moduls.ItemFAQ;
import com_country_city.country_city_java.countrycitygame.R;

public class FAQActivity extends AppCompatActivity implements buildRecyclerView {

    private RecyclerView recyclerViewFAQ;
    private ArrayList<ItemFAQ> listFAQ;
    private AdapterFAQ adapterFAQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        buildRecyclerView();
        setNewArrayList();
        buildArrayList();
        setNewAdapter();

    }

    @Override
    public void buildArrayList() {
        listFAQ.add(new ItemFAQ("Title 1", "ajksdufgajklsdhfgkajsdhf g"));
        listFAQ.add(new ItemFAQ("Title 2", "ajksdufgajklsddasdfasdfasdfashfgkajsdhf g"));
        listFAQ.add(new ItemFAQ("Title 3", "asdfasdfasdfasdf asdfasdfasdfsgsadfasd asdfasdf"));
        listFAQ.add(new ItemFAQ("Title 4", "asdf g"));
        listFAQ.add(new ItemFAQ("Title 5", "ajksdufgajklsdhfdfasdfgkajsdhf g"));
    }

    @Override
    public void buildRecyclerView() {
        recyclerViewFAQ = findViewById(R.id.recycler_view_faq);
        recyclerViewFAQ.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFAQ.setHasFixedSize(true);
    }

    @Override
    public void setNewArrayList() {
        listFAQ = new ArrayList<>();
    }

    @Override
    public void setNewAdapter() {
        adapterFAQ = new AdapterFAQ(listFAQ);
        recyclerViewFAQ.setAdapter(adapterFAQ);
    }
}