package com.example.android.tourapp.tourActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.tourapp.R;
import com.example.android.tourapp.ViewSitesFragment;

/**
 * Created by yadia on 7/12/16.
 */
public class ViewSiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ViewSitesFragment())
                .commit();
    }
}
