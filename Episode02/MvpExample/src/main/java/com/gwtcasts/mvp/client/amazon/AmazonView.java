package com.gwtcasts.mvp.client.amazon;

import com.google.gwt.user.client.ui.IsWidget;

public interface AmazonView extends IsWidget{
	
	public interface Presenter{
		public void onButtonClicked();
	}

	public void setPresenter(Presenter presenter);
	public void setTitle(String title);
		
}
