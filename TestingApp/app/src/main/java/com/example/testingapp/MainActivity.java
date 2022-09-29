package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.testingapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   public void irCalculadora(View view){
        Intent intent = new Intent(this, miCalculadora.class);
        Button botonCalcu = (Button) findViewById(R.id.boton);
        String boton = botonCalcu.getText().toString();
        startActivity(intent);
    }
}