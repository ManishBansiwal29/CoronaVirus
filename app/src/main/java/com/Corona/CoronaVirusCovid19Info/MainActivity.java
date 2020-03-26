package com.Corona.CoronaVirusCovid19Info;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //AdView bannerAd;
    //bannerAd1;
    boolean adLoaded;

    private ImageView symptomsImageView,preventionsImageView,informationImageView,casesImageView;

    private TextView symptomsTextView,preventionTextView,informationTextView,casesTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bannerAd1=findViewById(R.id.bannerAd1);




        MobileAds.initialize(MainActivity.this,"ca-app-pub-8993759357277977~5277408804");
        final AdView bannerAd = findViewById(R.id.bannerAd);
        bannerAd.loadAd(new AdRequest.Builder().build());

        bannerAd.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded(){
                adLoaded=true;
            }
            @Override
            public void onAdFailedToLoad(int errorCode){
                adLoaded=false;
            }
        });

        final AdView bannerAd1 = findViewById(R.id.bannerAd1);
        bannerAd1.loadAd(new AdRequest.Builder().build());
        bannerAd1.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                adLoaded=true;
            }

            @Override
            public void onAdFailedToLoad(int errorcode) {
                adLoaded=false;
            }
        });




        symptomsImageView = findViewById(R.id.symptomsImageView);
        preventionsImageView=findViewById(R.id.preventionsImageView);
        informationImageView=findViewById(R.id.informationImageView);
        casesImageView=findViewById(R.id.casesImageView);

        symptomsTextView=findViewById(R.id.symptomsTextView);
        preventionTextView=findViewById(R.id.preventionTextView);
        casesTextView=findViewById(R.id.casesTextView);
        informationTextView=findViewById(R.id.informationTextView);


        symptomsImageView.setOnClickListener(this);
        preventionsImageView.setOnClickListener(this);
        casesImageView.setOnClickListener(this);
        informationImageView.setOnClickListener(this);


        symptomsTextView.setOnClickListener(this);
        preventionTextView.setOnClickListener(this);
        casesTextView.setOnClickListener(this);
        informationTextView.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.symptomsImageView:
                Intent intent = new Intent(MainActivity.this,symptoms_corona.class);
                startActivity(intent);
                break;
            case R.id.preventionsImageView:
                Intent intentPrevention = new Intent(MainActivity.this,prevention.class);
                startActivity(intentPrevention);
                break;
            case R.id.informationImageView:
                Intent intentInformation = new Intent(MainActivity.this,Information_corona.class);
                startActivity(intentInformation);
                break;
            case R.id.casesImageView:
                Intent intentCases = new Intent(MainActivity.this,cases_corona.class);
                startActivity(intentCases);
                break;

            case R.id.symptomsTextView:
                Intent intent1 = new Intent(MainActivity.this,symptoms_corona.class);
                startActivity(intent1);
                break;
            case R.id.preventionTextView:
                Intent intentPrevention1 = new Intent(MainActivity.this,prevention.class);
                startActivity(intentPrevention1);
                break;
            case R.id.informationTextView:
                Intent intentInformation1 = new Intent(MainActivity.this,Information_corona.class);
                startActivity(intentInformation1);
                break;
            case R.id.casesTextView:
                Intent intentCases1 = new Intent(MainActivity.this,cases_corona.class);
                startActivity(intentCases1);
                break;

        }
    }

}

