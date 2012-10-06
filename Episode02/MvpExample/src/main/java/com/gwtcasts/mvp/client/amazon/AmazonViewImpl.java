package com.gwtcasts.mvp.client.amazon;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ParagraphElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class AmazonViewImpl extends Composite implements AmazonView{

	private static AmazonViewImplUiBinder uiBinder = GWT
			.create(AmazonViewImplUiBinder.class);

	interface AmazonViewImplUiBinder extends UiBinder<Widget, AmazonViewImpl> {
	}

	AmazonView.Presenter presenter;
	
	public AmazonViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;
	
	@UiField
	ParagraphElement title;

	public AmazonViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		presenter.onButtonClicked();

	}

	public void setTitle(String text) {
		title.setInnerText(text);
	}

	public String getTitle() {
		return title.getInnerText();
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
