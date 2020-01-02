package com.example.amst6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {

    private TextView tvTitle;
    private TextView tvDatos;
    private TextView tvDesc;
    private ImageView imageButton;

    private String titulo;
    private String datos;
    private String desc;
    private String imagen;
    private String fondo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        tvTitle= (TextView) findViewById(R.id.titulo);
        tvDatos= (TextView) findViewById(R.id.datos);
        tvDesc= (TextView) findViewById(R.id.descripcion);

        imageButton= (ImageView) findViewById(R.id.imagen);

        titulo=getIntent().getExtras().get("titulo").toString();
        datos=getIntent().getExtras().get("datos").toString();
        desc=getIntent().getExtras().get("descripcion").toString();
        imagen=getIntent().getExtras().get("imagen").toString();
        
        tvTitle.setText(titulo);
        tvDatos.setText(datos);
        tvDesc.setText(desc);

        switch (imagen) {
            case "capitan":
                imageButton.setImageResource(R.drawable.captain);
                break;
            case "iron":
                imageButton.setImageResource(R.drawable.iron_man);
                break;
            case "spider":
                imageButton.setImageResource(R.drawable.spiderman);
                break;
            case "guardianes":
                imageButton.setImageResource(R.drawable.guardians);
                break;
            case "vengadores":
                imageButton.setImageResource(R.drawable.avengers);
                break;
            case "thor":
                imageButton.setImageResource(R.drawable.thor);
                break;
        }

    }

    @Override
    public void onBackPressed(){
        Intent reg=new Intent(Informacion.this,Menu.class);
        startActivity(reg);
        finish();
    }
}
