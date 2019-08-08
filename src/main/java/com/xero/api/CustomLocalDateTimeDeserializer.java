package com.xero.api;

import java.lang.reflect.Type;

import org.threeten.bp.LocalDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
 
public class CustomLocalDateTimeDeserializer implements JsonSerializer<LocalDateTime>, JsonDeserializer<LocalDateTime> {
    
	private static DateTimeFormatter utcFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS");
	private static DateTimeFormatter utcFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSS");
	private static DateTimeFormatter utcFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSS");
	private static DateTimeFormatter utcFormatter4 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSS");
	private static DateTimeFormatter utcFormatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
	private static DateTimeFormatter utcFormatter6 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SS");
	private static DateTimeFormatter utcFormatter7 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.S");
	private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
	
	public JsonElement serialize(LocalDateTime localDateTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(localDateTime.format(dateTimeFormatter));
    }
 
	public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
		
		if(json.getAsString().length() == 27) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter);
		} else if(json.getAsString().length() == 26) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter2);
		} else if(json.getAsString().length() == 25) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter3);
		} else if(json.getAsString().length() == 24) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter4);
		} else if(json.getAsString().length() == 23) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter5);
		} else if(json.getAsString().length() == 22) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter6);
		} else if(json.getAsString().length() == 21) {
			return LocalDateTime.parse(json.getAsString(), utcFormatter7);
		} else {
			return LocalDateTime.parse(json.getAsString(), dateTimeFormatter);
		}
	}
}