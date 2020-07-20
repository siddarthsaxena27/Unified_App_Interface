package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant);

        Button open1 = findViewById(R.id.Clashroyale);
        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uber = "https://playnow.clashroyale.com/";
                Uri uberaddress = Uri.parse(uber);
                Intent openuber = new Intent(Intent.ACTION_VIEW, uberaddress);
                if (openuber.resolveActivity(getPackageManager()) != null)
                    startActivity(openuber);
            }
        });

        Button open2 = findViewById(R.id.Goibibo);
        open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ola = "https://www.goibibo.com";
                Uri olaaddress = Uri.parse(ola);
                Intent openola = new Intent(Intent.ACTION_VIEW, olaaddress);
                if (openola.resolveActivity(getPackageManager()) != null)
                    startActivity(openola);
            }
        });

        Button open3 = findViewById(R.id.Naukri);
        open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gmail = "https://www.naukri.com";
                Uri gmailaddress = Uri.parse(gmail);
                Intent opengmail = new Intent(Intent.ACTION_VIEW, gmailaddress);
                if (opengmail.resolveActivity(getPackageManager()) != null)
                    startActivity(opengmail);
            }
        });

        Button open4 = findViewById(R.id.Jamcity);
        open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String drive = "http://ppig.jamcity.com/";
                Uri driveaddress = Uri.parse(drive);
                Intent opendrive = new Intent(Intent.ACTION_VIEW, driveaddress);
                if (opendrive.resolveActivity(getPackageManager()) != null)
                    startActivity(opendrive);
            }
        });

        Button open5 = findViewById(R.id.Finalfant);
        open5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String spotify = "https://deeplink-android.epicaction-online.com";
                Uri spotifyaddress = Uri.parse(spotify);
                Intent openspotify = new Intent(Intent.ACTION_VIEW, spotifyaddress);
                if (openspotify.resolveActivity(getPackageManager()) != null)
                    startActivity(openspotify);
            }
        });


    }
}
