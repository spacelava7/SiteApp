package com.example.android.tourapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.android.tourapp.toursite.TourAdapter;
import com.example.android.tourapp.toursite.TourSite;

import java.util.ArrayList;



public class ViewSitesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1 = "Hot spots to visit";
    private String mParam2;

    public ViewSitesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ViewSitesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ViewSitesFragment newInstance(String param1, String param2) {
        ViewSitesFragment fragment = new ViewSitesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

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
        words.add(new TourSite("YZU Building 7","lutti"));
        words.add(new TourSite("The Park", "otiiko"));
        words.add(new TourSite("Shrimping Site", "tolookosu"));
        words.add(new TourSite("YZU Turtle Pond", "oyyisa"));
        words.add(new TourSite("The Big 7-11", "massokka"));
        words.add(new TourSite("The Pond", "temmokka"));

        LinearLayout viewSiteView = (LinearLayout) rootView.findViewById(R.id.categoryView);

        //ArrayAdapter<E>
        TourAdapter wordItemAdapter = new TourAdapter (getActivity(), words, R.color.color_viewstop);
        ListView listView = (ListView) rootView.findViewById(R.id.itemList);
        listView.setAdapter(wordItemAdapter);

        return  rootView;

    }

}
