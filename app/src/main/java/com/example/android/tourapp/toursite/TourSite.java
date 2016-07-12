package com.example.android.tourapp.toursite;

/**
 * Created by yadia on 7/11/16.
 */
public class TourSite {

    private String mSiteName;
    private String mLocation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;
    final static int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor class for arraylist with only name and address
     * @param name
     * @param address
     */

    public TourSite(String name, String address){
        mSiteName = name;
        mLocation = address;
    }

    /**
     * constructor class for arraylist with image resource
     * @param name
     * @param address
     * @param resourceId
     */

    public TourSite(String name, String address, int resourceId){
        mSiteName = name;
        mLocation = address;
        mImageResourceID = resourceId;
    }

    public String getSiteName(){
        return  mSiteName;
    }

    public void setSiteName(String locationName){
        mSiteName = locationName;
    }

    public void setLocation(String address){
        mLocation = address;
    }

    public String getLocation(){
        return  mLocation;
    }

    public int getImageResourceId(){
        return mImageResourceID;
    }

    /**
     *  Checks to see if the array list has specified an image
     * @return
     */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

}
