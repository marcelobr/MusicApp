package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrackListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_list);

        // Find the Button that start the music player activity
        Button player = (Button) findViewById(R.id.go_to_player);

        // Find the Button that returns to the home screen
        Button homeButton = (Button) findViewById(R.id.go_to_home);

        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the player Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(TrackListActivity.this, MusicPlayerActivity.class);
                startActivity(playerIntent);
            }
        });

        // Set a click listener on that View
        homeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(TrackListActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
