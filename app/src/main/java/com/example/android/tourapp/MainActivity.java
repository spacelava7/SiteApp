package com.example.android.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.android.tourapp.tourActivity.BrunchActivity;
import com.example.android.tourapp.tourActivity.NightLifeActivity;
import com.example.android.tourapp.tourActivity.PhrasesActivity;
import com.example.android.tourapp.tourActivity.RestaurantsActivity;
import com.example.android.tourapp.tourActivity.ViewSitesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final FrameLayout viewSite = (FrameLayout) findViewById(R.id.frame_viewSites);

        viewSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewSiteIntent = new Intent(MainActivity.this, ViewSitesActivity.class);
                startActivity(viewSiteIntent);
            }
        });

        final FrameLayout restaurants = (FrameLayout) findViewById(R.id.frame_restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });
        final FrameLayout phrases = (FrameLayout) findViewById(R.id.frame_phrase);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

        final FrameLayout brunch = (FrameLayout) findViewById(R.id.frame_brunch);
        brunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent brunchIntent = new Intent(MainActivity.this, BrunchActivity.class);
                startActivity(brunchIntent);
            }
        });

        final FrameLayout nightLife = (FrameLayout) findViewById(R.id.frame_nightLife);
        nightLife.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLifeActivity.class);
                startActivity(nightLifeIntent);
            }
        });



    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem settingMenu = menu.findItem(R.id.settingMenu);

        // Configure the search info and add any event listeners...
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settingMenu:
                // User chose the "Settings" item, show the app settings UI...
                return true;


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
    */
}
