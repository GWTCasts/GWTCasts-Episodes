package com.gwtcasts.mvp.client.mississippi;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwtcasts.mvp.client.MvpActivity;
import com.gwtcasts.mvp.client.MvpContext;

public class MississippiActivity extends MvpActivity<MississippiView, MississippiPlace, MvpContext> implements MississippiView.Presenter {


	public MississippiActivity(MississippiView view, MississippiPlace place,
			PlaceController placeController, MvpContext context) {
		super(view, place, placeController, context);
		
	}

	private EventBus eventBus;

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
        this.eventBus = eventBus;
        getView().setPresenter(this);
        panel.setWidget(getView());	}

	@Override
	public void onButtonClicked() {
		// TODO Auto-generated method stub
		
	}

}
