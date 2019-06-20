package com.example.teatrosalvador.teatrosalvador.Activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.teatrosalvador.teatrosalvador.R;

public class PrimeiraActivity extends AppCompatActivity {

    private ImageButton Teatros;
    private ImageButton Eventos;
    private ImageButton Ingressos;
    private ImageButton Mapas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        Teatros = findViewById(R.id.Teatros);
        Eventos = findViewById(R.id.Eventos);
        Ingressos = findViewById(R.id.Ingressos);
        Mapas = findViewById(R.id.Mapas);

      Teatros.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,TeatroActivity.class));
                Toast.makeText(PrimeiraActivity.this, " Veja os teatros de Salvador aqui ! ", Toast.LENGTH_SHORT).show();
            }
        });


        Eventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,EventoWebActivity.class));
                Toast.makeText(PrimeiraActivity.this, " Eventos de teatro em Salvador ", Toast.LENGTH_SHORT).show();
            }
        });

        Ingressos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,IngressosActivity.class));
                Toast.makeText(PrimeiraActivity.this,"Compre seu ingresso por aqui",Toast.LENGTH_SHORT).show();
            }
        });


        Mapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrimeiraActivity.this,MapasActivity.class));
                Toast.makeText(PrimeiraActivity.this,"Localize seu Teatro Favorito ",Toast.LENGTH_SHORT).show();
            }
        });





    }
}
