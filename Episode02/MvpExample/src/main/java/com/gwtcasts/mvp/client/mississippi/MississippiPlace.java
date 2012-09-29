package com.gwtcasts.mvp.client.mississippi;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MississippiPlace extends Place {
	private final String token;

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MississippiPlace(String token) {
		this.token = token;
	}

	public String getToken() {
		return this.token;
	}

	public static class Tokenizer implements PlaceTokenizer<MississippiPlace> {

		@Override
		public MississippiPlace getPlace(String token) {
			return new MississippiPlace(token);
		}

		@Override
		public String getToken(MississippiPlace place) {
			return place.getToken();
		}

	}

}
