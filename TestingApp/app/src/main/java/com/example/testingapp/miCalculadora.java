package com.example.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class miCalculadora extends AppCompatActivity  {

    private Button botonSuma;
    private Button botonResta;
    private Button botonMultiplicacion;
    private Button botonDivision;

    private TextView resultado;

    private EditText numero1;
    private EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoraxml);

        resultado = findViewById(R.id.resultado);
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        botonSuma = findViewById(R.id.boton_suma);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( suma(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });

        botonResta = findViewById(R.id.boton_resta);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( resta(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });

        botonMultiplicacion = findViewById(R.id.boton_multiplicacion);
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( multiplicacion(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });

        botonDivision = findViewById(R.id.boton_division);
        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado.setText( division(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()))+"");
            }
        });

    }
    public double suma(int a, int b){
        return a+b;
    }

    public double resta(int a, int b){
        return a-b;
    }

    public double multiplicacion(int a, int b){
        return a*b;
    }

    public double division(int a, int b){
        int respuesta = 0;
        if (b!=0 ) {
            respuesta = a/b;
        }
        return respuesta;
    }
}
