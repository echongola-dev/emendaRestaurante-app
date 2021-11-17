package com.ezc.emendaderestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplasScreenActivity extends AppCompatActivity {

    Intent i;
    String pedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splas_screen);

        i=getIntent();
        pedido = i.getExtras().getString("pedido");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                i = new Intent(SplasScreenActivity.this, ResumoDoPedidoActivity.class);
                i.putExtra("pedido" , pedido);
                startActivity(i);
            }
        },4000);
    }
}