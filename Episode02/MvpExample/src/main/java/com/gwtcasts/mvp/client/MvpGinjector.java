package com.gwtcasts.mvp.client;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtcasts.mvp.client.amazon.AmazonView;
import com.gwtcasts.mvp.client.mississippi.MississippiView;

@GinModules({MvpModule.class})
public interface MvpGinjector extends Ginjector {

    public EventBus getEventBus();

    public PlaceController getPlaceController();

    public AmazonView getAmazonView();

    public MississippiView getMississippiView();

    public MainView getMainView();

    public MvpContextImpl getContext();
    
    public GreetingServiceAsync getService();
    
}
