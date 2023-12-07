package com.example.app_for_os;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class emergency_call extends AppCompatActivity {

    Button btnPol, btn119, btnCat;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_call);

        btnPol = (Button) findViewById(R.id.btnPol);
        btn119 = (Button) findViewById(R.id.btn119);
        btnCat = (Button) findViewById(R.id.btnCat);

        btnPol.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("tel:/112"));
                startActivity(mIntent);

            }
        });

        btn119.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri
                        .parse("tel:/119"));
                startActivity(mIntent);

            }
        });

        btnCat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent Intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Intent);

            }
        });
    }
}
