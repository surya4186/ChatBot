package com.zsgs.stackview;

import org.json.simple.JSONArray;

import java.util.Scanner;

public class StackView {

	public void displayOptions(JSONArray options) {
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i));
		}
	}

	public int getUserChoice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your option : ");
		int n = input.nextInt();
		return n;
	}

	public void showThankYouMessage() {
		System.out.println("Thank you for visiting our website...");
	}
}
