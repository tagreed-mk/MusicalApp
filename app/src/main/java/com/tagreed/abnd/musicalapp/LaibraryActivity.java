package com.tagreed.abnd.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LaibraryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laibrary);
        setTitle("Library Screen");
        TextView ExploreArtist = (TextView) findViewById(R.id.ExploreArtistLibrary);
        ExploreArtist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1){
                Intent ArtistIntent = new Intent(LaibraryActivity.this,ArtistsActivity.class);
                startActivity(ArtistIntent);
            }
        });
        TextView ExploreAlbum = (TextView) findViewById(R.id.ExploreAlbumLibrary);
        ExploreAlbum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v2){
                Intent AlbumIntent = new Intent(LaibraryActivity.this,AlbumActivity.class);
                startActivity(AlbumIntent);
            }
        });
    }
}
