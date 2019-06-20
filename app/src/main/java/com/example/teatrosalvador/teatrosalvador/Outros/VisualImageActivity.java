package com.example.teatrosalvador.teatrosalvador.Outros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.teatrosalvador.teatrosalvador.R;

public class VisualImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visual_image);


        ImageView img = (ImageView) findViewById(R.id.imgTeatroM);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b != null) {

            img.setImageResource(b.getInt("IMG"));
        }
    }
}