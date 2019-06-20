package com.example.teatrosalvador.teatrosalvador.Outros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.teatrosalvador.teatrosalvador.R;

public class HistoriaTeatroActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_teatro);




        TextView Teatro = (TextView) findViewById(R.id.txtTeatrot);
        TextView Historia2 = (TextView) findViewById(R.id.txtHistoria);
        final ImageView Imagem = (ImageView) findViewById(R.id.ImgTea2);



        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {

            Teatro.setText(b.getString("TAT"));
            Historia2.setText(b.getString("TIT"));
            Imagem.setImageResource(b.getInt("IMG2"));

        }







    }
}
