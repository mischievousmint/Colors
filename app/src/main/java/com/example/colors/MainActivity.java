package com.example.colors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnGreen, btnBlack, btnRed, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlack = findViewById(R.id.btnBlack);
        btnBlue = findViewById(R.id.btnBlue);
        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity","Green");
                Toast.makeText(getApplicationContext(),"Green " + v.getId(), Toast.LENGTH_LONG).show();
                Intent i =  new Intent(getApplicationContext(), colorActivity.class);
                i.putExtra("color", "Green");
                startActivity(i);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity","Blue");
                Toast.makeText(getApplicationContext(),"Blue " + v.getId(), Toast.LENGTH_LONG).show();
                Intent i =  new Intent(getApplicationContext(), colorActivity.class);
                i.putExtra("color", "Blue");
                startActivity(i);
            }
        });

        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity","Black");
                Toast.makeText(getApplicationContext(),"Black " + v.getId(), Toast.LENGTH_LONG).show();
                Intent i =  new Intent(getApplicationContext(), colorActivity.class);
                i.putExtra("color", "Black");
                startActivity(i);
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("MainActivity","Red");
                Toast.makeText(getApplicationContext(),"Red " + v.getId(), Toast.LENGTH_LONG).show();
                Intent i =  new Intent(getApplicationContext(), colorActivity.class);
                i.putExtra("color", "Red");
                startActivity(i);
            }
        });

    }
}
