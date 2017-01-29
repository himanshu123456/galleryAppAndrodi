package com.awesome.galleryapp;

import java.util.ArrayList;

/**
 * Created by Himanshu on 29-01-2017.
 */

public class GalleryStore {
    private String type;
    private int count;
    private ArrayList<Integer> topThreeImage;
    GalleryStore(String type,int count,ArrayList<Integer> topThreeImage){
        this.type = type;
        this.count=count;
        this.topThreeImage=topThreeImage;
    }
    public ArrayList<Integer> getTopThreeImage() {
        return topThreeImage;
    }

    public int getCount() {
        return count;
    }

    public String getType() {
        return type;
    }
}
