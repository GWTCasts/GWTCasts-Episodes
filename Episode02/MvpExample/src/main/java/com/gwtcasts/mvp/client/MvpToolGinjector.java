package com.gwtcasts.mvp.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtcasts.mvp.client.amazon.AmazonView;

@GinModules({MvpToolModule.class})
public interface MvpToolGinjector extends Ginjector {

    public EventBus getEventBus();

    public PlaceController getPlaceController();

    public AmazonView getAmazonView();

    public MvpContext getContext();

}
