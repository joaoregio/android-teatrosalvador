package com.example.teatrosalvador.teatrosalvador.Outros;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.teatrosalvador.teatrosalvador.R;

public class AdaptadorNewTeatro extends BaseAdapter {

     private static LayoutInflater inflater = null;
     Context context;
     String[][] datos;
     int[] datosImg;



    public AdaptadorNewTeatro(Context context, String[][] datos, int[] datosImg) {
        this.context = context;
        this.datos = datos;
        this.datosImg = datosImg;
        inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {


        final View vista = inflater.inflate(R.layout.elemento_teatro,null);



        TextView  Teatro = (TextView) vista.findViewById(R.id.txtTeatro);
        TextView Endereco = (TextView)vista.findViewById(R.id.txtEndereco);
        TextView Telefone = (TextView)vista.findViewById(R.id.txtTelefone);
        TextView Historia = (TextView)vista.findViewById(R.id.txtHistoria);
        ImageView Imagem = (ImageView)vista.findViewById(R.id.ImgTeatro);



        Teatro.setText(datos[i][0]);
        Endereco.setText(datos[i][1]);
        Telefone.setText(datos[i][2]);
        //Historia.setText(datos[i][3]);
        Imagem.setImageResource(datosImg[i]);


        Imagem.setTag(i);



        Imagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  VisualImageActivity = new Intent(context, VisualImageActivity.class);
                VisualImageActivity.putExtra("IMG",datosImg[(Integer)v.getTag()]);
                context.startActivity(VisualImageActivity);
            }
        });


        return vista;
    }


    @Override
    public int getCount() {
        return datosImg.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
