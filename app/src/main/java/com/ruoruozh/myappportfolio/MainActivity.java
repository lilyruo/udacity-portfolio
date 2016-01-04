package com.ruoruozh.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setUpButtons();
    }

    private void setUpButtons() {
        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch Spotify streamer app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button scoresButton = (Button) findViewById(R.id.scoresApp);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch scores app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button libraryButton = (Button) findViewById(R.id.libraryApp);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch library app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button buildButton = (Button) findViewById(R.id.buildItBigger);
        buildButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch build it bigger app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button XYZButton = (Button) findViewById(R.id.xyzReader);
        XYZButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch XYZ reader app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        Button capstoneButton = (Button) findViewById(R.id.myOwnApp);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(MainActivity.this, "The button will launch my capstone app!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
