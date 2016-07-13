package com.example.android.tourapp.tourActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.R;
import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        final ArrayList<TourSite > words = new ArrayList<TourSite>();
        words.add(new TourSite("你好 Nǐ hǎo ","Hello"));
        words.add(new TourSite("謝謝 Xièxiè", "Thank you"));
        words.add(new TourSite("再見 Zàijiàn", "Goodbye"));
        words.add(new TourSite("我要一杯啤酒 Wǒ yào yībēi píjiǔ", "I want one beer"));
        words.add(new TourSite("對不起 Duìbùqǐ", "I am sorry"));
        words.add(new TourSite("這個 Zhège", "This one"));
        words.add(new TourSite("那個 Nàgè", "That one"));
        words.add(new TourSite("我要一個 Wǒ yào yīgè", "I want one"));

        LinearLayout viewSiteView = (LinearLayout) findViewById(R.id.categoryView);
        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (this, words, R.color.color_phrases);
        ListView listView = (ListView) findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);

    }
}
