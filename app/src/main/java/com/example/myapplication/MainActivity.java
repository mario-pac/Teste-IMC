package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public double calculoIMC(double peso, double altura){

        return peso/(altura*altura);
    }

    public void MostrarIMC(View v){
        EditText peso = findViewById(R.id.editPeso);
        EditText altura =findViewById(R.id.editAltura);
        TextView imc =findViewById(R.id.valor);

        double p = Double.parseDouble(String.valueOf(peso.getText()));
        double a= Double.parseDouble(String.valueOf(altura.getText()));

        Double valorIMC;
        valorIMC = this.calculoIMC(p,a);

        imc.setText(valorIMC.toString());
    }
    public void MostrarStatus(View v){
        EditText peso = findViewById(R.id.editPeso);
        EditText altura =findViewById(R.id.editAltura);
        TextView imcStatus =findViewById(R.id.status);
        double p = Double.parseDouble(String.valueOf(peso.getText()));
        double a= Double.parseDouble(String.valueOf(altura.getText()));
        Double valor;
        valor = this.calculoIMC(p,a);
        if(valor<18.5){
            imcStatus.setText("Abaixo do Peso");
        }else if(valor>=18.5 && valor<=24.9){
            imcStatus.setText("Peso Normal");
        }else if(valor>=25 && valor<=29.9){
            imcStatus.setText("Sobrepeso");
        }else if(valor>=30 && valor<=34.9){
            imcStatus.setText("Obesidade");
        }else if(valor>=35 && valor<=39.9){
            imcStatus.setText("Obesidade 2");
        }else{
            imcStatus.setText("Obesidade 3");
        }
    }
}