package com.example.tareaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button webBtn = (Button) findViewById(R.id.botonWeb);

        webBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marvel.com/"));
                startActivity(intent);
            }
        });


    }

    public void finalizar (View view){
        Intent finalizar = new Intent(this, MainActivity.class);
        startActivity(finalizar);
    }






}