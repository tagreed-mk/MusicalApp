package com.tagreed.abnd.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ExploreLibrary = (TextView) findViewById(R.id.ExploreLabel);
        ExploreLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ExploreIntent = new Intent(MainActivity.this,LaibraryActivity.class);
                startActivity(ExploreIntent);
            }
        });
        ImageView PlayButtonOne = (ImageView) findViewById(R.id.PlayOne);
        PlayButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vOne){
                Intent PlaySongOneIntent = new Intent(MainActivity.this,SongsActivity.class);
                startActivity(PlaySongOneIntent);
            }
        });
        ImageView PlayButtonTwo = (ImageView) findViewById(R.id.PlayTwo);
        PlayButtonTwo.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View vTwo){
                Intent PalySongTwoIntent = new Intent(MainActivity.this,SongsActivity.class);
            }
        });
    }
}
