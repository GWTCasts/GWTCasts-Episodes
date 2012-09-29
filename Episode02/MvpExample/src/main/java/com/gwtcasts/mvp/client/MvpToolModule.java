package com.gwtcasts.mvp.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.gwtcasts.mvp.client.amazon.AmazonView;
import com.gwtcasts.mvp.client.amazon.AmazonViewImpl;

/**
 * @author Gordon Pike
 * 
 */
public class MvpToolModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// application event bus
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		bind(PlaceController.class).toProvider(PlaceProvider.class).in(
				Singleton.class);

		bind(AmazonView.class).to(AmazonViewImpl.class).in(Singleton.class);

		bind(MvpContext.class).to(
				MvpContext.class).in(Singleton.class);
	}

	static class PlaceProvider implements Provider<PlaceController> {
		@Inject
		EventBus bus;

		@Override
		public PlaceController get() {
			return new PlaceController(this.bus);
		}
	}

}
