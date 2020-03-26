package com.Corona.CoronaVirusCovid19Info;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class cases_corona extends AppCompatActivity {

    private WebView casesWebView;
    private boolean adLoaded;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Corona Virus Cases");
        setContentView(R.layout.activity_cases_corona);

        casesWebView=findViewById(R.id.casesWebView);

        casesWebView.setWebViewClient(new WebViewClient());
        casesWebView.loadUrl("https://www.worldometers.info/coronavirus/#countries");



    }
}

