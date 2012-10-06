package com.gwtcasts.mvp.client;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtcasts.mvp.client.amazon.AmazonPlace;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MvpExample implements EntryPoint {
	Logger logger = Logger.getLogger("com.gwtcasts.mvp.client.MvpExample");
	MvpGinjector ginjector = GWT.create(MvpGinjector.class);

	private Place defaultPlace = new AmazonPlace(null);
	private MvpContext context;
	private EventBus eventBus;

	@Override
	public void onModuleLoad() {
		logger.log(Level.CONFIG, "onModuleLoad");

		context = ginjector.getContext();
		eventBus = ginjector.getEventBus();
		
		GreetingServiceAsync service = ginjector.getService();
		
		PlaceController placeController = ginjector.getPlaceController();

		// Start ActivityManager for the main widget with our ActivityMapper
		ActivityMapper activityMapper = new MvpActivityMapper(ginjector,
				placeController, context);
		ActivityManager activityManager = new ActivityManager(activityMapper,
				eventBus);

		MainView main = ginjector.getMainView();
		activityManager.setDisplay(main.getContainer());
		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		MvpPlaceHistoryMapper historyMapper = GWT.create(MvpPlaceHistoryMapper.class);
		PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(
				historyMapper);
		historyHandler.register(placeController, eventBus, defaultPlace);

		RootLayoutPanel.get().add(main);
		// Goes to the place represented on URL else default place
		historyHandler.handleCurrentHistory();

	}
}
