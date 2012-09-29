package com.gwtcasts.mvp.client.amazon;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AmazonPlace extends Place {
	private final String token;

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public AmazonPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public static class Tokenizer implements PlaceTokenizer<AmazonPlace> {

		@Override
		public AmazonPlace getPlace(String token) {
			return new AmazonPlace(token);
		}

		@Override
		public String getToken(AmazonPlace place) {
			return place.getToken();
		}

	}

}
