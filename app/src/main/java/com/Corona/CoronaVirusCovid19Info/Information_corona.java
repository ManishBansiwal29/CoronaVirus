package com.Corona.CoronaVirusCovid19Info;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Information_corona extends AppCompatActivity {

    private boolean adLoaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_corona);
        setTitle("Information");

        MobileAds.initialize(Information_corona.this,"ca-app-pub-8993759357277977~5277408804");
        final AdView bannerAd6 = findViewById(R.id.bannerAd6);
        bannerAd6.loadAd(new AdRequest.Builder().build());

        bannerAd6.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                adLoaded=true;
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                adLoaded=false;
            }
        });


        final AdView bannerAd7 = findViewById(R.id.bannerAd7);
        bannerAd7.loadAd(new AdRequest.Builder().build());

        bannerAd7.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                adLoaded=true;
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                adLoaded=false;
            }
        });
    }
}

