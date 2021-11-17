package com.ezc.emendaderestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResumoDoPedidoActivity extends AppCompatActivity {

    TextView tv_resumo_pedido;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_do_pedido);

        i = getIntent();

        tv_resumo_pedido = findViewById(R.id.resumo_do_pedido);
        tv_resumo_pedido.setText(i.getExtras().getString("pedido"));

    }
}