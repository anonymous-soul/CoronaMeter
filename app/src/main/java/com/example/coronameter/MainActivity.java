package com.example.coronameter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        cardView=findViewById(R.id.cardView);
        OverviewClass[] overviewClass=new OverviewClass[]{
                new OverviewClass("Andhra Pradesh",R.drawable.andhra),
                new OverviewClass("Arunachal Pradesh",R.drawable.arunachal),
                new OverviewClass("Assam",R.drawable.assam),
                new OverviewClass("Bihar",R.drawable.bihar),
                new OverviewClass("Chhattisgarh",R.drawable.chhattisgarh),
                new OverviewClass("Goa",R.drawable.goa),
                new OverviewClass("Gujarat",R.drawable.gujarat),
                new OverviewClass("Haryana",R.drawable.haryana),
                new OverviewClass("Himachal Pradesh",R.drawable.himachal),
                new OverviewClass("Jharkhand",R.drawable.jharkhand),
                new OverviewClass("Karnataka",R.drawable.karnataka),
                new OverviewClass("Kerala",R.drawable.kerala),
                new OverviewClass("Madhya Pradesh",R.drawable.madhya),
                new OverviewClass("Maharashtra",R.drawable.maharastra),
                new OverviewClass("Manipur",R.drawable.manipur),
                new OverviewClass("Meghalaya",R.drawable.meghalaya),
                new OverviewClass("Mizoram",R.drawable.mizoram),
                new OverviewClass("Nagaland",R.drawable.nagaland),
                new OverviewClass("Odisha",R.drawable.odisha),
                new OverviewClass("Punjab",R.drawable.punjab),
                new OverviewClass("Rajasthan",R.drawable.rajasthan),
                new OverviewClass("Sikkim",R.drawable.sikkim),
                new OverviewClass("Tamil Nadu",R.drawable.tamil),
                new OverviewClass("Telangana",R.drawable.telangana),
                new OverviewClass("Tripura",R.drawable.tripura),
                new OverviewClass("Uttar Pradesh",R.drawable.uttar),
                new OverviewClass("Uttarakhand",R.drawable.uttarakhand),
                new OverviewClass("West Bengal",R.drawable.bengal),
                new OverviewClass("Andaman And Nicobar Islands",R.drawable.andaman),
                new OverviewClass("Chandigarh",R.drawable.chandigarh),
                new OverviewClass("Dadra and nagar haveli and Daman and Diu",R.drawable.dadra),
                new OverviewClass("Delhi",R.drawable.delhi),
                new OverviewClass("Jammu and Kashmir",R.drawable.jammukashmir),
                new OverviewClass("Ladakh",R.drawable.ladakh),
                new OverviewClass("Puducherry",R.drawable.puducherry)
        };
        RecViewAdapter recViewAdapter=new RecViewAdapter(overviewClass);
        recyclerView.setAdapter(recViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}