package com.gwtcasts.mvp.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.gwtcasts.mvp.client.amazon.AmazonActivity;
import com.gwtcasts.mvp.client.amazon.AmazonPlace;

public class MvpActivityMapper implements ActivityMapper {
    private final MvpToolGinjector ginjector;
    private final PlaceController placeController;
    private final MvpContext context;

    public MvpActivityMapper(MvpToolGinjector ginjector, PlaceController placeController, MvpContext context) {
        super();
        this.ginjector = ginjector;
        this.placeController = placeController;
        this.context = context;
    }

    @Override
    public Activity getActivity(Place place) {
        if (place instanceof AmazonPlace) {
            return new AmazonActivity(ginjector.getAmazonView(), (AmazonPlace) place, placeController, context);
        }
        
        else
            return null;
    }

}
