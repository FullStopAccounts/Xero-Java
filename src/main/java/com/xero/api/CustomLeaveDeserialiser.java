package com.xero.api;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;
import java.util.Arrays;

import com.xero.models.payroll.Leave;
import com.xero.models.payroll.PayrollResponse;

public class CustomLeaveDeserialiser implements JsonDeserializer<PayrollResponse> {

	@Override
	public PayrollResponse deserialize(JsonElement jsonElement, Type typeOf, JsonDeserializationContext context) throws JsonParseException {
		PayrollResponse result = null;
	    Gson gson = new Gson();
	
	    try {
	        result = gson.fromJson(jsonElement, PayrollResponse.class);
	        
	    } catch (JsonSyntaxException jse) {
	        try {
	            Leave leave = gson.fromJson(jsonElement.getAsJsonObject().get("leave").getAsString(), Leave.class);
	
	            result = new PayrollResponse();
	            result.setLeave(Arrays.asList(leave));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return result;
	}
}