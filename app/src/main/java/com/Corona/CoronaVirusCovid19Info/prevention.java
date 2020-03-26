package com.Corona.CoronaVirusCovid19Info;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class prevention extends AppCompatActivity {

    private boolean adLoaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        setTitle("Preventions");

        MobileAds.initialize(prevention.this,"ca-app-pub-8993759357277977~5277408804");
        final AdView bannerAd4 = findViewById(R.id.bannerAd4);
        bannerAd4.loadAd(new AdRequest.Builder().build());

        bannerAd4.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                adLoaded=true;
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                adLoaded=false;
            }
        });


        final AdView bannerAd5 = findViewById(R.id.bannerAd5);
        bannerAd5.loadAd(new AdRequest.Builder().build());

        bannerAd5.setAdListener(new AdListener(){
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

