package com.example.colors;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class colorActivity extends AppCompatActivity {

    RelativeLayout colorContent;
    FloatingActionButton floatButtonPlus;
    ImageView imageColor;
    RadioButton buttonSoft;
    RadioButton buttonHard;
    RadioGroup buttonGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        colorContent = findViewById(R.id.Content);

        final String color =getIntent().getStringExtra("color");

        switch (color) {
            case "Red":
                colorContent.setBackgroundColor(Color.RED);
                break;
            case "Black":
                colorContent.setBackgroundColor(Color.BLACK);
                break;
            case "Green":
                colorContent.setBackgroundColor(Color.GREEN);
                break;
            case "Blue":
                colorContent.setBackgroundColor(Color.BLUE);
                break;
            default:
        }

        floatButtonPlus = findViewById(R.id.floatButtonPlus);

        floatButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View colorActivity) {
                Intent g = new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.google.com/"+ "search?source=hp&ei=YbsDXaiAKL2bjLsPluqW2Ao&q=" + color));
                startActivity(g);
            }
        });

        imageColor = findViewById(R.id.imgColor);

        switch (color) {
            case "Red":
                imageColor.setImageResource(R.drawable.red);
                break;
            case "Black":
                imageColor.setImageResource(R.drawable.black);
                break;
            case "Green":
                imageColor.setImageResource(R.drawable.green);
                break;
            case "Blue":
                imageColor.setImageResource(R.drawable.blue);
                break;
            default:
        }

        buttonSoft = findViewById(R.id.btnSoft);
        buttonHard = findViewById(R.id.btnHard);
        buttonGroup = findViewById(R.id.btnIntense);


        // This overrides the radiogroup onCheckListener
        buttonGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
              switch (checkedId){
                  case R.id.btnSoft:
                      imageColor.setImageAlpha(50);
                      break;
                  case R.id.btnHard:
                      imageColor.setImageAlpha(200);
                      break;
              }
            }
        });

        buttonSoft.setChecked(true);
    }
}