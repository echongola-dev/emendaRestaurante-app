package com.ezc.emendaderestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb_cafe, cb_sorvete, cb_leiteQuente, cb_nata, cb_pizza, cb_sumo;
    double cafe = 50, sorvete = 75, lQuente = 100, nata = 80, sumo = 150, pizza = 350;
    EditText et_cafe, et_sorvete, et_leiteQuente, et_nata, et_pizza, et_sumo;
    Button bt_fazerPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_cafe = findViewById(R.id.cb_cafe);
        cb_sorvete = findViewById(R.id.cb_sorvete);
        cb_leiteQuente = findViewById(R.id.cb_leite_quente);
        cb_sumo = findViewById(R.id.cb_sumo);
        cb_nata = findViewById(R.id.cb_nata);
        cb_pizza = findViewById(R.id.cb_pizza);

        et_cafe = findViewById(R.id.et_quantCafe);
        et_sorvete = findViewById(R.id.et_quantSorvete);
        et_leiteQuente = findViewById(R.id.et_quantLeiteQuente);
        et_sumo = findViewById(R.id.et_quantSumo);
        et_nata = findViewById(R.id.et_quantNata);
        et_pizza = findViewById(R.id.et_quantPizza);

        bt_fazerPedido = findViewById(R.id.bt_fazerPedido);

        bt_fazerPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pedido = "";
                double valor = 0;

                  if  (cb_sorvete.isChecked()){
                   int quant = Integer.parseInt(et_sorvete.getText().toString()) ;
                      pedido+=quant+" Sorvete\n";
                      valor+=quant*sorvete;

                  }

                    if (cb_leiteQuente.isChecked()){
                int quant = Integer.parseInt(et_leiteQuente.getText().toString()) ;
                        pedido+=quant+" Leite Quente\n";
                        valor+=quant*lQuente;

                    }

                      if (cb_nata.isChecked()){
                int quant = Integer.parseInt(et_nata.getText().toString()) ;
                          pedido+=quant+" Nata\n";
                          valor+=quant*nata;

                      }

                         if (cb_sumo.isChecked()){
                int quant = Integer.parseInt(et_sumo.getText().toString()) ;
                             pedido+=quant+" Sumo\n";
                             valor+=quant *sumo;

                         }

                           if (cb_pizza.isChecked()){
                int quant = Integer.parseInt(et_pizza.getText().toString()) ;
                               pedido+=quant+" Pizza\n";
                               valor+=quant*pizza;

                           }

                              if (cb_cafe.isChecked()) {
                                  int quant = Integer.parseInt(et_cafe.getText().toString());
                                  pedido += quant + " Cafe\n";
                                  valor += quant * cafe;

                              }

                if (pedido.equals("")){
                    Toast.makeText(MainActivity.this, "Pedido Invalido", Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(MainActivity.this, SplasScreenActivity.class);
                    i.putExtra("pedido", pedido+"valor a pagar:  "+String.valueOf(valor));
                    startActivity(i);
                }
            }
        });
    }
}