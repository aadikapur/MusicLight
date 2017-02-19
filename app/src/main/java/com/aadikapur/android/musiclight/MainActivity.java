package com.aadikapur.android.musiclight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mainPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPage = (ImageView)findViewById(R.id.mainPage);
        mainPage.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
                Toast.makeText(MainActivity.this, "bottom", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                Intent hostSessionIntent = new Intent(MainActivity.this, HostSession.class);
                startActivity(hostSessionIntent);
            }
            public void onSwipeLeft() {
                Intent joinSessionIntent = new Intent(MainActivity.this, JoinSession.class);
                startActivity(joinSessionIntent);
            }
            public void onSwipeBottom() {
                Intent uploadMusicIntent = new Intent(MainActivity.this, UploadMusic.class);
                startActivity(uploadMusicIntent);
            }

        });

    }
}
