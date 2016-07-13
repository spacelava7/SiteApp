package com.example.android.tourapp.tourActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.R;
import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;



public class ViewSitesActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        final ArrayList<TourSite> words = new ArrayList<TourSite>();
        words.add(new TourSite("YZU Building 7","No. 135, Yuandong Rd, Zhongli District, Taoyuan City, 320",R.drawable.ic_local_play));
        words.add(new TourSite("The Park", "20, Taoyuan City, Zhongli District, Xing'an 1st St",R.drawable.ic_nature_people_white_24dp));
        words.add(new TourSite("Shrimping Site", "320, Yongfu Road, Chungli City, Taoyuan County 789",R.drawable.ic_shrimp));
        words.add(new TourSite("YZU Turtle Pond", "No. 135, Yuandong Rd, Zhongli District, Taoyuan City, 320",R.drawable.ic_lake));
        words.add(new TourSite("The Big 7-11", "No. 57, Section 2, Xingren Rd, Zhongli District, Taoyuan City, 320",R.drawable.ic_7_11_logo));
        words.add(new TourSite("The Pond", "334, Taoyuan City, Bade District, in Jiadong",R.drawable.ic_lake));

        LinearLayout viewSiteView = (LinearLayout) findViewById(R.id.categoryView);

        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (this, words, R.color.color_viewstop);
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);
        listView.setAdapter(wordItemAdapter);

    }


}
