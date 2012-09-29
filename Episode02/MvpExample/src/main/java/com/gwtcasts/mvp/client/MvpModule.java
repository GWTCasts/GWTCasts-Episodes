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
import com.gwtcasts.mvp.client.mississippi.MississippiView;
import com.gwtcasts.mvp.client.mississippi.MississippiViewImpl;

/**
 * @author Gordon Pike
 * 
 */
public class MvpModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// application event bus
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);

		bind(PlaceController.class).toProvider(PlaceProvider.class).in(
				Singleton.class);

		bind(AmazonView.class).to(AmazonViewImpl.class).in(Singleton.class);

		bind(MississippiView.class).to(MississippiViewImpl.class).in(Singleton.class);

		bind(MainView.class).to(MainViewImpl.class).in(Singleton.class);

		bind(MvpContext.class).to(
				MvpContextImpl.class).in(Singleton.class);
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
