package com.dash.lakbaydashboard;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cardProf;
    CardView cardSettings;
    CardView cardEwallet;
    CardView cardTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardProf = findViewById(R.id.cardProf);
        cardSettings = findViewById(R.id.cardSettings);
        cardEwallet = findViewById(R.id.cardEwallet);
        cardTransaction = findViewById(R.id.cardTransaction);

        cardProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Profile");
            }
        });
        cardProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Profile");
            }
        });
        cardSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Settings");
            }
        });
        cardEwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("E-Wallet");
            }
        });
        cardTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("Transaction History");
            }
        });
    }
    private void showToast(String message){
        Toast.makeText(this, message


                , Toast.LENGTH_SHORT).show();
    }
}