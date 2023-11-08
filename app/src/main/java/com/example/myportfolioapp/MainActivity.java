package com.example.myportfolioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button callButton, uriButton, mapButton, mapUriButton,webPageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callButton = findViewById(R.id.button);

        // Implicit intent ACTION_DIAL
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                startActivity(callIntent);
            }
        });

        // Intent URI
        uriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri phoneNumber = Uri.parse("tel:07322121111");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(callIntent);
            }
        });

        //Intent ACTION_VIEW
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_VIEW);
                startActivity(callIntent);
            }
        });

        //Intent ACTION_VIEW with URI
        mapUriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri mapCoordinates = Uri.parse("geo:59.3245845857908, 18.072124936833777?z=10");
                Intent callIntent = new Intent(Intent.ACTION_VIEW, mapCoordinates);
                startActivity(callIntent);
            }
        });

        //Intent ACTION_VIEW with Web page address
        webPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webPage = Uri.parse("https://www.android.com");
                Intent callIntent = new Intent(Intent.ACTION_VIEW, webPage);
                startActivity(callIntent);
            }
        });
    }
}