package com.example.uai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText password;
    private Button login;
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = (EditText)findViewById(R.id.pin);
        login = (Button)findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checker(password.getText().toString());
            }
        });
    }

    private void checker(String password)
    {
        if(password.equals("Genx@1527")){
            Intent listview = new Intent(LoginActivity.this, FirstListActivity.class);
            startActivity(listview);
        }
        else {
            counter--;

            if (counter == 0) {
                login.setEnabled(false);
            }
        }
        LoginActivity.this.finish();

    }
}
