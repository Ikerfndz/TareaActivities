package com.example.tareaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void anterior2 (View view){
        Intent anterior2 = new Intent(this, MainActivity2.class);
        startActivity(anterior2);
    }

    public void siguiente2 (View view){
        Intent siguiente2 = new Intent(this, MainActivity4.class);
        startActivity(siguiente2);
    }
}