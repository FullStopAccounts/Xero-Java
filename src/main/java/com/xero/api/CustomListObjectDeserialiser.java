package com.xero.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class CustomListObjectDeserialiser<T> implements JsonDeserializer<T> {

	@Override
    public T deserialize(JsonElement jsonElement, Type typeOf, JsonDeserializationContext context) throws JsonParseException {
        if (jsonElement instanceof JsonObject) {
            final JsonObject obj = (JsonObject) jsonElement;
            
            JsonArray array = new JsonArray();
            array.add(obj);
            
            final int size = array.size();
            if (size == 0) {
                return null;
            }

            return context.deserialize(array, typeOf);
        }

        return context.deserialize(jsonElement, typeOf);
    }
}