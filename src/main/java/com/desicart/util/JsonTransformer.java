package com.desicart.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JsonTransformer {
    private  final static ObjectMapper objectMapper = new ObjectMapper();

    public static String objectToString(Object object) throws IOException {
        String jsonString = objectMapper.writeValueAsString(object);
        return jsonString;
    }

    public static <T> T stringToObject(String jsonString, Class<T> className) throws IOException {
        T object = objectMapper.readValue(jsonString, className);

        return object;
    }

//    public static <T> List<T> stringToObjectArray(String jsonString, Class<T> className) throws IOException {
//        List<T> objectArray = objectMapper.reader()
//                .forType(new TypeReference<List<T>>(){})
//                .readValue(jsonString);
//
//        return objectArray;
//    }
}
