package com.gwtcasts.mvp.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwtcasts.mvp.client.amazon.AmazonPlace;
import com.gwtcasts.mvp.client.mississippi.MississippiPlace;

/**
 * @author Gordon Pike
 * 
 */
@WithTokenizers({ AmazonPlace.Tokenizer.class, MississippiPlace.Tokenizer.class})
public interface MvpPlaceHistoryMapper extends PlaceHistoryMapper {

}
