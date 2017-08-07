package com.tagreed.abnd.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        setTitle("Song Screen");

        ImageView DownloadPayButton =  (ImageView) findViewById(R.id.DownloadButton);
        DownloadPayButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent PayementIntent = new Intent(SongsActivity.this,PaymentActivity.class);
                startActivity(PayementIntent);
            }
        });
    }
}
