package com.example.teatrosalvador.teatrosalvador.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.teatrosalvador.teatrosalvador.R;

public class IngressosActivity extends AppCompatActivity {



    private android.webkit.WebView webingressos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingressos);


        webingressos = (android.webkit.WebView)findViewById(com.example.teatrosalvador.teatrosalvador.R.id.webview);
        webingressos.setWebViewClient(new android.webkit.WebViewClient());
        webingressos.loadUrl("https://compreingressos.com/espetaculos?cidade=Salvador");


        android.webkit.WebSettings webSettings = webingressos.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }

    public void onBackPressed(){

        if(webingressos.canGoBack()){

            webingressos.goBack();
        }  else{

            super.onBackPressed();

        }
    }

}




