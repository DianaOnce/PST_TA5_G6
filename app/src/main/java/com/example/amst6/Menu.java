package com.example.amst6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    private ImageButton bt1;
    private ImageButton bt2;
    private ImageButton bt3;
    private ImageButton bt4;
    private ImageButton bt5;
    private ImageButton bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        bt1= (ImageButton) findViewById(R.id.bt1);
        bt2= (ImageButton) findViewById(R.id.bt2);
        bt3= (ImageButton) findViewById(R.id.bt3);
        bt4= (ImageButton) findViewById(R.id.bt4);
        bt5= (ImageButton) findViewById(R.id.bt5);
        bt6= (ImageButton) findViewById(R.id.bt6);

        if (bt1 != null) {
            bt1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent reg=new Intent(Menu.this, Informacion.class);
                    reg.putExtra("titulo", getString(R.string.titulo1));
                    reg.putExtra("datos", getString(R.string.datos1));
                    reg.putExtra("descripcion", getString(R.string.desc1));
                    reg.putExtra("imagen", getString(R.string.img1));
                    startActivity(reg);
                    finish();
                }
            });
        }
        if (bt2 != null) {
            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent reg=new Intent(Menu.this, Informacion.class);
                    reg.putExtra("titulo", getString(R.string.titulo2));
                    reg.putExtra("datos", getString(R.string.datos2));
                    reg.putExtra("descripcion", getString(R.string.desc2));
                    reg.putExtra("imagen", getString(R.string.img2));
                    startActivity(reg);
                    finish();
                }
            });
        }
        if (bt3 != null) {
            bt3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      Intent reg=new Intent(Menu.this, Informacion.class);
                        reg.putExtra("titulo", getString(R.string.titulo3));
                        reg.putExtra("datos", getString(R.string.datos3));
                        reg.putExtra("descripcion", getString(R.string.desc3));
                    reg.putExtra("imagen", getString(R.string.img3));
                        startActivity(reg);
                        finish();
                  }
            });
        }
        if (bt4 != null) {
            bt4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      Intent reg=new Intent(Menu.this, Informacion.class);
                        reg.putExtra("titulo", getString(R.string.titulo4));
                        reg.putExtra("datos", getString(R.string.datos4));
                        reg.putExtra("descripcion", getString(R.string.desc4));
                    reg.putExtra("imagen", getString(R.string.img4));
                        startActivity(reg);
                        finish();
                  }
            });
        }
        if (bt5 != null) {
            bt5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                      Intent reg=new Intent(Menu.this, Informacion.class);
                        reg.putExtra("titulo", getString(R.string.titulo5));
                        reg.putExtra("datos", getString(R.string.datos5));
                        reg.putExtra("descripcion", getString(R.string.desc5));
                    reg.putExtra("imagen", getString(R.string.img5));
                        startActivity(reg);
                        finish();
                }
            });
        }
        if (bt6 != null) {
            bt6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        Intent reg=new Intent(Menu.this, Informacion.class);
                        reg.putExtra("titulo", getString(R.string.titulo6));
                        reg.putExtra("datos", getString(R.string.datos6));
                        reg.putExtra("descripcion", getString(R.string.desc6));
                        reg.putExtra("imagen", getString(R.string.img6));
                        startActivity(reg);
                        finish();
                }
            });
        }

    }
    @Override
    public void onBackPressed(){

    }
}
