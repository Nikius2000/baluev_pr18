package com.example.baluev_pr18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnZD1);
        btn2 = findViewById(R.id.btnZD2);
        btn3 = findViewById(R.id.btnZD3);
        btn4 = findViewById(R.id.btnZD4);
        btn5 = findViewById(R.id.btnZD5);
        btn6 = findViewById(R.id.btnZD6);
        btn7 = findViewById(R.id.btnZD7);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnZD1){
            startActivity(new Intent(this, Zadanie1.class));
        }
        if (v.getId() == R.id.btnZD2){
            startActivity(new Intent(this, Zadanie2.class));
        }
        if (v.getId() == R.id.btnZD3){
            startActivity(new Intent(this, Zadanie3.class));
        }
        if (v.getId() == R.id.btnZD4){
            startActivity(new Intent(this, Zadanie4.class));
        }
        if (v.getId() == R.id.btnZD5){
            startActivity(new Intent(this, Zadanie5.class));
        }
        if (v.getId() == R.id.btnZD6){
            startActivity(new Intent(this, Zadanie6.class));
        }
        if (v.getId() == R.id.btnZD7){
            startActivity(new Intent(this, Zadanie7.class));
        }
    }
}