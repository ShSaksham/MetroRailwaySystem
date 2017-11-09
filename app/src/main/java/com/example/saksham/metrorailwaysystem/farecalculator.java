package com.example.saksham.metrorailwaysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class farecalculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fare_calculator);
        Button b1 = (Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent in = new Intent(getApplicationContext(),delhifare.class);
                startActivity(in);
            }
        });
        Button b2 = (Button) findViewById(R.id.button5);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent in = new Intent(getApplicationContext(),chennaifare.class);
                startActivity(in);
            }
        });

        Button b3 = (Button) findViewById(R.id.button6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent in = new Intent(getApplicationContext(),jaipurfare.class);
                startActivity(in);
            }
        });
    }
    }

