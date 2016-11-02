package com.example.aabalalonso.proyectobase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miboton = (Button) findViewById(R.id.idbutton);
        miboton.setText("Ordenar");
    }



    void eventoBoton(View v){
        Button miboton =(Button)v;
        ((Button)v).setText("Hola");

    }
}
