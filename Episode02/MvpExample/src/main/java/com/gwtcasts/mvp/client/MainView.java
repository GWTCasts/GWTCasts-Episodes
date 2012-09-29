package com.gwtcasts.mvp.client;

import com.google.gwt.user.client.ui.HasOneWidget;
import com.google.gwt.user.client.ui.IsWidget;

public interface MainView extends IsWidget {

	public HasOneWidget getContainer();
}
