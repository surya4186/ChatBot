package com.zsgs.stackPresenter;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.zsgs.stackModel.SelectOption;
import com.zsgs.stackModel.StackModel;
import com.zsgs.stackview.StackView;

import java.util.Stack;

public class StackPresenter {

	private Stack<SelectOption> backStack = new Stack<>();
	private StackModel stackModel;
	private StackView stackView;

	public StackPresenter(StackModel stackModel, StackView stackView) {
		this.stackModel = stackModel;
		this.stackView = stackView;
	}

	public void start() throws ParseException {
		int choice = 0;
		backStack.push(new SelectOption(0, 0));
		System.out.println("Cricbuzz");
		System.out.println("------------------------");
		stackView.displayOptions(stackModel.getChoices(0, 0));

		do {
			choice = stackView.getUserChoice();

			if (choice == 9) {
				backStack.pop();
				if (backStack.isEmpty()) {
					break;
				}
			} else {
				backStack.push(new SelectOption(backStack.peek().getLevel() + 1, choice));
			}

			SelectOption top = backStack.peek();
			stackView.displayOptions(stackModel.getChoices(top.getLevel(), top.getChoice()));

		} while (choice != 0);

		stackView.showThankYouMessage();
	}
}
