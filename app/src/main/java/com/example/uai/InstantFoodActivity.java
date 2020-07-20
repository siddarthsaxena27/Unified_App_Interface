package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstantFoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_food);
        Button open1 = findViewById(R.id.Zomato);
        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String zomato = "https://www.zomato.com/hyderabad";
                Uri zomatoaddress = Uri.parse(zomato);
                Intent openzomato = new Intent(Intent.ACTION_VIEW, zomatoaddress);
                if (openzomato.resolveActivity(getPackageManager()) != null)
                    startActivity(openzomato);
            }
        });

        Button open2 = findViewById(R.id.Swiggy);
        open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String swiggy = "https://www.swiggy.com";
                Uri swiggyaddress = Uri.parse(swiggy);
                Intent openswiggy = new Intent(Intent.ACTION_VIEW, swiggyaddress);
                if (openswiggy.resolveActivity(getPackageManager()) != null)
                    startActivity(openswiggy);
            }
        });

        Button open3 = findViewById(R.id.UberEats);
        open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UberEat = "https://www.ubereats.com/en-IN/";
                Uri UberEataddress = Uri.parse(UberEat);
                Intent openubereat = new Intent(Intent.ACTION_VIEW, UberEataddress);
                if (openubereat.resolveActivity(getPackageManager()) != null)
                    startActivity(openubereat);
            }
        });

        Button open4 = findViewById(R.id.Dominos);
        open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dominos = "https://www.dominos.co.in";
                Uri dominoaddress = Uri.parse(dominos);
                Intent opendominos = new Intent(Intent.ACTION_VIEW, dominoaddress);
                if (opendominos.resolveActivity(getPackageManager()) != null)
                    startActivity(opendominos);
            }
        });

        Button open5 = findViewById(R.id.PizzaHut);
        open5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String PizzaHut = "https://online.pizzahut.co.in/home";
                Uri pizzahutaddress = Uri.parse(PizzaHut);
                Intent openpizzahut = new Intent(Intent.ACTION_VIEW, pizzahutaddress);
                if (openpizzahut.resolveActivity(getPackageManager()) != null)
                    startActivity(openpizzahut);
            }
        });


    }
}
