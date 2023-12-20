package com.zsgs;

import org.json.simple.parser.ParseException;

import com.zsgs.stackModel.StackModel;
import com.zsgs.stackPresenter.StackPresenter;
import com.zsgs.stackview.StackView;

public class StackMain {
	public static void main(String[] args) throws ParseException {
		StackModel stackModel = new StackModel();
		StackView stackView = new StackView();
		StackPresenter stackPresenter = new StackPresenter(stackModel, stackView);
		stackPresenter.start();
	}
}
