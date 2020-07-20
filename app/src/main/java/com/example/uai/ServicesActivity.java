package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button open1 = findViewById(R.id.BHIM);
        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bhim = "https://www.bhimupi.org.in";
                Uri bhimaddress = Uri.parse(bhim);
                Intent openbhim = new Intent(Intent.ACTION_VIEW, bhimaddress);
                if (openbhim.resolveActivity(getPackageManager()) != null)
                    startActivity(openbhim);
            }
        });

        Button open2 = findViewById(R.id.UMANG);
        open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String umang = "https://web.umang.gov.in/web/#/";
                Uri umangaddress = Uri.parse(umang);
                Intent openumang = new Intent(Intent.ACTION_VIEW, umangaddress);
                if (openumang.resolveActivity(getPackageManager()) != null)
                    startActivity(openumang);
            }
        });

        Button open3 = findViewById(R.id.Passport);
        open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String passport = "https://portal2.passportindia.gov.in/AppOnlineProject/user/mPassportSevaDownload";
                Uri passportaddress = Uri.parse(passport);
                Intent openpassport = new Intent(Intent.ACTION_VIEW, passportaddress);
                if (openpassport.resolveActivity(getPackageManager()) != null)
                    startActivity(openpassport);
            }
        });

        Button open4 = findViewById(R.id.StartupInd);
        open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String startup = "https://www.startupindia.gov.in";
                Uri startupaddress = Uri.parse(startup);
                Intent openstartup = new Intent(Intent.ACTION_VIEW, startupaddress);
                if (openstartup.resolveActivity(getPackageManager()) != null)
                    startActivity(openstartup);
            }
        });

        Button open5 = findViewById(R.id.MyGHMC);
        open5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myghmc = "https://www.ghmc.gov.in";
                Uri ghmcaddress = Uri.parse(myghmc);
                Intent openmyghmc = new Intent(Intent.ACTION_VIEW, ghmcaddress);
                if (openmyghmc.resolveActivity(getPackageManager()) != null)
                    startActivity(openmyghmc);
            }
        });


    }
}
  