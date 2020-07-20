package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnlineShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shop);
        Button open1 = findViewById(R.id.Amazon);
        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amazon = "https://www.amazon.in";
                Uri amazonaddress = Uri.parse(amazon);
                Intent openamazon = new Intent(Intent.ACTION_VIEW, amazonaddress);
                if (openamazon.resolveActivity(getPackageManager()) != null)
                    startActivity(openamazon);
            }
        });

        Button open2 = findViewById(R.id.Flipkart);
        open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String flipkart = "https://dl.flipkart.com";
                Uri flipkartaddress = Uri.parse(flipkart);
                Intent openflip = new Intent(Intent.ACTION_VIEW, flipkartaddress);
                if (openflip.resolveActivity(getPackageManager()) != null)
                    startActivity(openflip);
            }
        });

        Button open3 = findViewById(R.id.Myntra);
        open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myntra = "https://www.myntra.com";
                Uri myntraaddress = Uri.parse(myntra);
                Intent openmynt = new Intent(Intent.ACTION_VIEW, myntraaddress);
                if (openmynt.resolveActivity(getPackageManager()) != null)
                    startActivity(openmynt);
            }
        });

        Button open4 = findViewById(R.id.Snapdeal);
        open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String snapdeal = "https://www.snapdeal.com";
                Uri snapaddress = Uri.parse(snapdeal);
                Intent opensnap = new Intent(Intent.ACTION_VIEW, snapaddress);
                if (opensnap.resolveActivity(getPackageManager()) != null)
                    startActivity(opensnap);
            }
        });

        Button open5 = findViewById(R.id.EBay);
        open5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ebay = "https://in.ebay.com";
                Uri ebayaddress = Uri.parse(ebay);
                Intent openebay = new Intent(Intent.ACTION_VIEW, ebayaddress);
                if (openebay.resolveActivity(getPackageManager()) != null)
                    startActivity(openebay);
            }
        });


    }
}
