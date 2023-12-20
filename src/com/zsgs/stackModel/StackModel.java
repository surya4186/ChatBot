package com.zsgs.stackModel;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StackModel {

	public JSONArray getChoices(int level, int choice) throws org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONArray arr = null;
		try {
			JSONObject jsonObject = (JSONObject) jsonParser
					.parse(new FileReader("C:\\Users\\ELCOT\\eclipse-work\\ChatBot\\src\\com\\zsgs\\jsonArray.json"));
			if (jsonObject.containsKey(String.valueOf(level))) {
				JSONObject getLevel = (JSONObject) jsonObject.get(String.valueOf(level));
				if (getLevel.containsKey(String.valueOf(choice))) {
					Object getDetails = getLevel.get(String.valueOf(choice));
					arr = (JSONArray) getDetails;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
}
