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

        Button catBtn, calBtn;
        ImageView catImg;

        catBtn = (Button) findViewById(R.id.catBtn);
        catImg = (ImageView) findViewById(R.id.catImg);

        calBtn = (Button) findViewById(R.id.calBtn);

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                catImg.setVisibility(View.VISIBLE);
                catImg.setImageResource(R.drawable.cat);

            }
        });

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Calculator.class);
                startActivity(intent);
            }
        });


    }
}