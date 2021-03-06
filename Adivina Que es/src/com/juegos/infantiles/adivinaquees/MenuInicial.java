package com.juegos.infantiles.adivinaquees;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.support.v4.app.NavUtils;

public class MenuInicial extends Activity implements OnClickListener{

	ImageButton btnAnimales, btnFrutas;
	Intent ventana=new Intent();
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        
        this.btnAnimales=(ImageButton) this.findViewById(R.id.btnAnimales);
        this.btnAnimales.setOnClickListener(this);
        
        this.btnFrutas=(ImageButton) this.findViewById(R.id.btnFrutas);
        this.btnFrutas.setOnClickListener(this);
    }

	public void onClick(View v) {
		String tipo="";
		switch (v.getId()) {
		case R.id.btnAnimales:
			tipo="Animales";
			break;
		case R.id.btnFrutas:
			tipo="Frutas";
			break;	
		default:
			break;
		}
		
		this.ventana.setClass(getApplicationContext(), Juego.class);
		this.ventana.putExtra("Tipo", tipo);
		this.startActivity(ventana);
	}

    

    
}
