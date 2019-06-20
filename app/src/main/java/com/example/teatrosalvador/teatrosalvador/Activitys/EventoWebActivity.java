package com.example.teatrosalvador.teatrosalvador.Activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class EventoWebActivity extends AppCompatActivity {


        private android.webkit.WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.teatrosalvador.teatrosalvador.R.layout.activity_evento_web);


        webview = (android.webkit.WebView)findViewById(com.example.teatrosalvador.teatrosalvador.R.id.webview);
        webview.setWebViewClient(new android.webkit.WebViewClient());
        webview.loadUrl("http://agendacultural.ba.gov.br/editoria/teatro/");


        android.webkit.WebSettings webSettings = webview.getSettings();
        webSettings.setJavaScriptEnabled(true);


        }

            public void onBackPressed(){

               if(webview.canGoBack()){

                   webview.goBack();
        }  else{

            super.onBackPressed();

               }
               }

        }
