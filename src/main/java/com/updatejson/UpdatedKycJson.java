package com.updatejson;

import org.json.JSONObject;

public class UpdatedKycJson {
	
	private static JSONObject newKycJson;

	public static JSONObject getNewKycJson() {
		return newKycJson;
	}

	public static void setNewKycJson(JSONObject newKycJson) {
		UpdatedKycJson.newKycJson = newKycJson;
	}



}
