package com.example.a585579.soundapp20;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer welcome = MediaPlayer.create(getApplicationContext(), R.raw.hello52);
        welcome.start();
    }
    public void openHelp(View view){
        Intent i = new Intent( this, Help.class);
        startActivity(i);
    }
    public void openEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto"));
        if (intent.resolveActivity(getPackageManager()) != null) ;
        startActivity(intent);
    }
}
