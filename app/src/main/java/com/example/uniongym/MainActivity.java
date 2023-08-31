package com.example.uniongym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para abrir la actividad "ExeActivity" al hacer clic en un botón
    public void openejercicios(View view) {
        Intent intent = new Intent(this, ExeActivity.class); // Crea un Intent para la actividad ExeActivity
        startActivity(intent); // Inicia la actividad ExeActivity
    }

    // Método para abrir la actividad "ObjeActivity" al hacer clic en un botón
    public void abrirobje(View view) {
        Intent intent = new Intent(this, ObjeActivity.class); // Crea un Intent para la actividad ObjeActivity
        startActivity(intent); // Inicia la actividad ObjeActivity
    }

    // Método para abrir la actividad "ObjeActivity" al hacer clic en un botón
    public void abriperfil(View view) {
        Intent intent = new Intent(this, PerfilActivity.class); // Crea un Intent para la actividad ObjeActivity
        startActivity(intent); // Inicia la actividad PerfilActivity
    }
}