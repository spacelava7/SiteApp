package com.example.android.tourapp.tourActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.R;
import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;

public class NightLifeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        final ArrayList<TourSite > words = new ArrayList<TourSite>();
        words.add(new TourSite("Search Night Club ","No. 182, Xinsheng Rd, Zhongli District, Taoyuan City, 320",R.drawable.ic_bar));
        words.add(new TourSite("Shrimping", "320, Yongfu Road, Chungli City, Taoyuan County 789", R.drawable.ic_shrimp));
        words.add(new TourSite("ChungYuan Night Market","Daren 5th St, Zhongli District,Taoyuan City, 320",R.drawable.ic_local_play));
        words.add(new TourSite("ZhongLi Night Market", "Xinming Rd, Zhongli District, Taoyuan City, 320", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Taoyuan Tourist Night Market", "Zhongzheng Rd, Taoyuan District, Taoyuan City, 330",R.drawable.ic_local_play));


        LinearLayout viewSiteView = (LinearLayout) findViewById(R.id.categoryView);

        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (this, words, R.color.color_nightLife);
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);
    }
}
