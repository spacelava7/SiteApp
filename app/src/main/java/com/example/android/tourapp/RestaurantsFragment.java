package com.example.android.tourapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1 = "Hot spots to visit";
    private String mParam2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Array list is set as final because its content will not change

        View rootView = inflater.inflate(R.layout.fragment_categories, container, false);

        final ArrayList<TourSite> words = new ArrayList<TourSite>();
        words.add(new TourSite("Cogliari","lutti"));
        words.add(new TourSite("Brownie", "otiiko"));
        words.add(new TourSite("Jenny's Talk", "tolookosu"));
        words.add(new TourSite("Yummie Burger", "oyyisa"));
        words.add(new TourSite("Jazz Cafe", "massokka"));
        words.add(new TourSite("Yang Mama's Dumplings", "temmokka"));

        LinearLayout viewSiteView = (LinearLayout) rootView.findViewById(R.id.categoryView);

        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (getActivity(), words, R.color.color_viewstop);
        ListView listView = (ListView) rootView.findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);

        return  rootView;

    }


    @Override
    public void onStop(){
        super.onStop();
    }
}
