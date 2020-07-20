package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        LaunchUAI launch = new LaunchUAI();
        launch.start();

    }
    private class LaunchUAI extends Thread{
        public void run(){
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            Intent loginact = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(loginact);
            MainActivity.this.finish();
        }

    }
}
