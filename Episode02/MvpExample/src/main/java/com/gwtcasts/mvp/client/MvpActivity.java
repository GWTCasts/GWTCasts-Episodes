package com.gwtcasts.mvp.client;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;

/**
 * MvpActivity
 * 
 * @author Gordon Pike
 * 
 */
public abstract class MvpActivity<V, P, C> extends AbstractActivity {

	private V view;
	private P place;
	private PlaceController placeController;
	private C context;

	public MvpActivity(final V view, final P place,
			final PlaceController placeController, final C context) {
		super();
		this.view = view;
		this.place = place;
		this.placeController = placeController;
		this.context = context;
	}

	public void goTo(Place newPlace) {
		this.placeController.goTo(newPlace);
	}

	/**
	 * @return the view
	 */
	public final V getView() {
		return this.view;
	}

	/**
	 * @return the place
	 */
	public final P getPlace() {
		return this.place;
	}

	/**
	 * @return the context
	 */
	public final C getContext() {
		return this.context;
	}
}
