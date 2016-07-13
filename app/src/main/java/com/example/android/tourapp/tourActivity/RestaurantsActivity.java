package com.example.android.tourapp.tourActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.R;
import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        final ArrayList<TourSite> words = new ArrayList<TourSite>();
        words.add(new TourSite("Cogliari","24°58'07.4\"N 121°16'03.0\"E", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Brownie", "Xingren Road 320 Chungli City, Taoyuan County,202", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Jenny's Talk", "320, Taoyuan City, Zhongli District, Xing'an 1st St, 12", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Yummie Burger", "oyyisa", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Jazz Cafe", "320 Zhongli District Taoyuan City, Xingren, Sec 67, Lane 77", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Yang Mama's Dumplings", "320, Taoyuan City, Zhongli District, Xing'an 1st St, 6", R.drawable.ic_restaurant_white_24dp));
        words.add(new TourSite("Smiling Fish", "320, Taoyuan City, Zhongli District, Lane 8, Xing'anyi St, 6", R.drawable.ic_restaurant_white_24dp));

        LinearLayout viewSiteView = (LinearLayout) findViewById(R.id.categoryView);

        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (this, words, R.color.color_restaurants);
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);

    }

    @Override
    public void onStop(){
        super.onStop();
    }
}
