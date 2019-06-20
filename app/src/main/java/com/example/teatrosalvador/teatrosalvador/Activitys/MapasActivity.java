package com.example.teatrosalvador.teatrosalvador.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.teatrosalvador.teatrosalvador.R;

public class MapasActivity extends AppCompatActivity {

    private android.webkit.WebView webmapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapas);


        webmapa = (android.webkit.WebView)findViewById(com.example.teatrosalvador.teatrosalvador.R.id.webview);
        webmapa.setWebViewClient(new android.webkit.WebViewClient());
        webmapa.loadUrl("https://www.google.com.br/maps/search/teatros+em+salvador/@-12.954923,-38.5073864,13z/data=!3m1!4b1");


        android.webkit.WebSettings webSettings = webmapa.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    public void onBackPressed(){

        if(webmapa.canGoBack()){

            webmapa.goBack();
        }  else{

            super.onBackPressed();

        }
    }

}





