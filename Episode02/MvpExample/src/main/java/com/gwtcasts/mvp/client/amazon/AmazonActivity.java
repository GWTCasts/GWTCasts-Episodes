package com.gwtcasts.mvp.client.amazon;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwtcasts.mvp.client.MvpActivity;
import com.gwtcasts.mvp.client.MvpContext;
import com.gwtcasts.mvp.client.mississippi.MississippiPlace;

public class AmazonActivity extends MvpActivity<AmazonView, AmazonPlace, MvpContext> implements AmazonView.Presenter {


	public AmazonActivity(AmazonView view, AmazonPlace place,
			PlaceController placeController, MvpContext context) {
		super(view, place, placeController, context);
		
	}

	private EventBus eventBus;

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
        this.eventBus = eventBus;
        getView().setPresenter(this);
        panel.setWidget(getView());
        if(getPlace().getTitle() != null)
        	getView().setTitle(getPlace().getTitle());
        else
        	getView().setTitle("");
    }

	@Override
	public void onButtonClicked() {
		goTo(new MississippiPlace(null));
		
	}

}
