package com.gwtcasts.mvp.client.mississippi;

import com.google.gwt.user.client.ui.IsWidget;

public interface MississippiView extends IsWidget{
	
	public interface Presenter{
		public void onButtonClicked();
	}

	public void setPresenter(Presenter presenter);
		
}
