package com.example.android.tourapp.toursite;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourapp.R;

import java.util.ArrayList;

/**
 * Created by yadia on 7/11/16.
 */
public class TourAdapter extends ArrayAdapter<TourSite> {

    private int mColorResourceId;

    /**
     * Constructor for WordAapter
     * @param context  --Activity context
     * @param tourSites -- ArrayList<TourSite> from Word object
     *              0 - gets inflated in the getView
     */

    public TourAdapter(Activity context, ArrayList<TourSite> tourSites, int colorResourceId){
        //(Activity context, int resource, ArrayList<T>
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tourSites);
        mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_list_layout, parent, false);
        }
        // Get the {@link TourSite} object located at this position in the list
        TourSite currentSite = getItem(position);

        TextView siteName = (TextView) listItemView.findViewById(R.id.itemList_txt1);
        siteName.setText(currentSite.getSiteName());

        TextView addressText = (TextView) listItemView.findViewById(R.id.itemList_txt2);
        addressText.setText(currentSite.getLocation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentSite.hasImage()){
            imageView.setImageResource(currentSite.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return  listItemView;
    }
}
