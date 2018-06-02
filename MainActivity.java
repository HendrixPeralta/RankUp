package com.hdx.rankup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ModelCompany> companiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        companiesList = new ArrayList<>();

        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "My Company", "Address place Holder 1", "4.1", "1"));
        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "Your Company", "Address place Holder 2", "4.2", "2"));
        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "His Company", "Address place Holder 3", "4.3", "3"));
        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "Her Company", "Address place Holder 4", "4.4", "4"));
        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "Our Company", "Address place Holder 5", "4.5", "4.5"));
        companiesList.add(new ModelCompany(R.drawable.ic_launcher_background, "Their Company", "Address place Holder 6", "4.6", "5"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rvLayoutManager = linearLayoutManager;

        recyclerView.setLayoutManager(rvLayoutManager);

        CompanyAdapter companyAdapter = new CompanyAdapter(this, companiesList);

        recyclerView.setAdapter(companyAdapter);
    }
}
