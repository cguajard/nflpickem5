package com.guaja.example.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

/**
 * Created by cguajardo on 9/15/16 at 9:10 PM
 */

//public class DateTimeDeserializer extends JsonDeserializer<DateTime> {
//
//    private static DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");
//
//    @Override
//    public static class DateTime deserialize(JsonParser jsonParser, DeserializationContext arg1) throws IOException, JsonProcessingException {
//        return formatter.parseDateTime(jsonParser.getText());
//    }
//
//    public static class SerializeDateTime extends JsonSerializer<DateTime> {
//        @Override
//        public void serialize(DateTime value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
//            jgen.writeString(DATE_TIME_FORMATTER.print(value));
//        }
//    }
//}

public class JsonDateTime {
    private static DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss");

    public static class DeserializeDateTime extends JsonDeserializer<DateTime> {
        @Override
        public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            return formatter.parseDateTime(jp.getText());
        }
    }

    public static class SerializeDateTime extends JsonSerializer<DateTime> {
        @Override
        public void serialize(DateTime value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeString(formatter.print(value));
        }
    }
}

