package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the Button that start the tracklist activity
        Button tracklist = (Button) findViewById(R.id.go_to_tracklist);

        // Set a click listener on that View
        tracklist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the tracklist Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent trackIntent = new Intent(AlbumsActivity.this, TrackListActivity.class);
                startActivity(trackIntent);
            }
        });
    }
}
