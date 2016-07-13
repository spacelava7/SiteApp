package com.example.android.tourapp.tourActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.R;
import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;

public class BrunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);


        final ArrayList<TourSite > words = new ArrayList<TourSite>();
        words.add(new TourSite("Laya 1 ","Hello", R.drawable.ic_local_cafe_white_24dp));
        words.add(new TourSite("Jenny Talks", "320, Taoyuan City, Zhongli District, Xing'an 1st St, 12"));
        words.add(new TourSite("Brunch", "Goodbye"));
        words.add(new TourSite("Good Morning", "I want one beer"));
        words.add(new TourSite("Sandwhich lady in YZu", "in front of building 2"));
        words.add(new TourSite("Laya 2", "320, Taoyuan City, Zhongli District, Far East Road 73", R.drawable.ic_local_cafe_white_24dp));

        LinearLayout viewSiteView = (LinearLayout) findViewById(R.id.categoryView);
        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (this, words, R.color.color_brunch);
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);
    }
}
