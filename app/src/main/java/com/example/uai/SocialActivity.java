package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        Button open1 = findViewById(R.id.Instagram);
        open1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String instagram = "https://www.instagram.com";
                Uri instaddress = Uri.parse(instagram);
                Intent openinst = new Intent(Intent.ACTION_VIEW, instaddress);
                if (openinst.resolveActivity(getPackageManager()) != null)
                    startActivity(openinst);
            }
        });

        Button open2 = findViewById(R.id.Whatsapp);
        open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String whatsapp = "https://chat.whatsapp.com";
                Uri whatsaddress = Uri.parse(whatsapp);
                Intent openwhats = new Intent(Intent.ACTION_VIEW, whatsaddress);
                if (openwhats.resolveActivity(getPackageManager()) != null)
                    startActivity(openwhats);
            }
        });

        Button open3 = findViewById(R.id.Twitter);
        open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twitter = "https://twitter.com/login";
                Uri twitaddress = Uri.parse(twitter);
                Intent opentwit = new Intent(Intent.ACTION_VIEW, twitaddress);
                if (opentwit.resolveActivity(getPackageManager()) != null)
                    startActivity(opentwit);
            }
        });

        Button open4 = findViewById(R.id.Facebook);
        open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String facebook = "https://www.facebook.com";
                Uri fbaddress = Uri.parse(facebook);
                Intent openfb = new Intent(Intent.ACTION_VIEW, fbaddress);
                if (openfb.resolveActivity(getPackageManager()) != null)
                    startActivity(openfb);
            }
        });

        Button open5 = findViewById(R.id.Telegram);
        open5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String telegram = "https://web.telegram.org/#/login";
                Uri teleaddress = Uri.parse(telegram);
                Intent opentele = new Intent(Intent.ACTION_VIEW, teleaddress);
                if (opentele.resolveActivity(getPackageManager()) != null)
                    startActivity(opentele);
            }
        });


    }
}
