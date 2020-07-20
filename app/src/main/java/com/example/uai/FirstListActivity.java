package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_list);

        Button SocialMedia=findViewById(R.id.SocialMedia);
        SocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent socialmedia =new Intent(FirstListActivity.this, SocialActivity.class);
                startActivity(socialmedia);
            }
        });

        Button OnlineShop=findViewById(R.id.OnlineShopping);
        OnlineShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent onlineshop=new Intent(FirstListActivity.this, OnlineShopActivity.class);
                startActivity(onlineshop);
            }
        });

        Button InstantFood=findViewById(R.id.InstantFood);
        InstantFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fooddel=new Intent(FirstListActivity.this, InstantFoodActivity.class);
                startActivity(fooddel);
            }
        });

        Button Services=findViewById(R.id.Services);
        Services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Services=new Intent(FirstListActivity.this, ServicesActivity.class);
                startActivity(Services);
            }
        });

        Button Productivity = findViewById(R.id.Productivity);
        Productivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Productivity=new Intent(FirstListActivity.this, InstantActivity.class);
                startActivity(Productivity);
            }
        });


    }
}
