package com.example.app_for_os;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button catBtn, dogBtn, foxBtn, emrBtn;
        ImageView catImg;

        catBtn = (Button) findViewById(R.id.catBtn);
        dogBtn = (Button) findViewById(R.id.dogBtn);
        foxBtn = (Button) findViewById(R.id.foxBtn);
        emrBtn = (Button) findViewById(R.id.emrBtn);
        
        catImg = (ImageView) findViewById(R.id.catImg);

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                catImg.setVisibility(View.VISIBLE);
                catImg.setImageResource(R.drawable.cat);

            }
        });

        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                catImg.setVisibility(View.VISIBLE);
                catImg.setImageResource(R.drawable.dog);

            }
        });

        foxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                catImg.setVisibility(View.VISIBLE);
                catImg.setImageResource(R.drawable.fox);

            }
        });


        emrBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), emergency_call.class);
                startActivity(intent);
            }
        });
    }
}