package com.example.amst6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private ImageButton btIngreso;
    private EditText username;
    private EditText password;
    private String enteredUsername;
    private String enteredPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        username=(EditText)findViewById(R.id.edEmail);
        password=(EditText)findViewById(R.id.edContraseña);
        btIngreso= (ImageButton) findViewById(R.id.btIngreso);

        if (btIngreso != null) {
            btIngreso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     enteredUsername = username.getText().toString();
                     enteredPassword = password.getText().toString();

                     String usuario="g6";
                     String contraseña="nomelase";


                     if (enteredUsername.equals(usuario) && enteredPassword.equals(contraseña)) {
                         Intent i = new Intent(Login.this,Menu.class);
                         finish();
                         startActivity(i);

                     }
                     else{
                         Toast.makeText(Login.this, "Usuario o contraseña incorrecta", Toast.LENGTH_LONG).show();
                     }

                }
            });
        }

    }

    @Override
    public void onBackPressed() {
    }
}


