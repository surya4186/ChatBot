package com.zsgs.stackModel;

public class SelectOption {
	private int level;
	private int choice;

	public SelectOption(int level, int choice) {
		this.level = level;
		this.choice = choice;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}
}
