package com.appuseries.jokewizard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.Joker;

public class Jokify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokify);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
    }
}
