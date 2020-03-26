package com.Corona.CoronaVirusCovid19Info;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class symptoms_corona extends AppCompatActivity {

    private boolean adLoaded;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_corona);
        setTitle("Symptoms");

        MobileAds.initialize(symptoms_corona.this,"ca-app-pub-8993759357277977~5277408804");
        final AdView bannerAd2 = findViewById(R.id.bannerAd2);
        bannerAd2.loadAd(new AdRequest.Builder().build());

        bannerAd2.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                adLoaded=true;
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                adLoaded=false;
            }
        });

        final AdView bannerAd3 = findViewById(R.id.bannerAd3);
        bannerAd3.loadAd(new AdRequest.Builder().build());
        bannerAd3.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                adLoaded=true;
            }

            @Override
            public void onAdFailedToLoad(int errorcode) {
                adLoaded=false;
            }
        });


    }
}

