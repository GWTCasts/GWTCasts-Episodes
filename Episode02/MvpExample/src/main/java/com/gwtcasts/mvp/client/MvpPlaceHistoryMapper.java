package com.gwtcasts.mvp.client;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwtcasts.mvp.client.amazon.AmazonPlace;

/**
 * @author Gordon Pike
 * 
 */
@WithTokenizers({ AmazonPlace.Tokenizer.class})
public interface MvpPlaceHistoryMapper extends PlaceHistoryMapper {

}
