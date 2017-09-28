package com.example.usuario.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Mi primera aplicación de Android
 * @author Alejandro Aguilar
 * @version 1.0
 * @see android.app.Activity
 */

public class HolaMundoActivity extends AppCompatActivity {

    //Creamos un objeto TextView sin asignarle memoria
    TextView txvHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);
        //Le asignamos memoria al TextView creado anteriormente y lo asociamos con el TextView del layout a traves del id
        txvHolaMundo = (TextView) findViewById(R.id.txvHolaMundo);
        //Modificamos el mensaje que habiamos asignado anteriormente a traves del string.xml mediante el metodo setText();
        txvHolaMundo.setText("¡Hola Mundo!");
    }
}
