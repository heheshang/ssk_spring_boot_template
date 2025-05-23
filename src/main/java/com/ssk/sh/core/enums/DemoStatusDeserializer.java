package com.ssk.sh.core.enums;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class DemoStatusDeserializer extends JsonDeserializer<DemoStatus> {

    @Override
    public DemoStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getValueAsString();
        try {
            return DemoStatus.fromValue(value);
        } catch (IllegalArgumentException e) {
            throw new IOException("Invalid DemoStatus value: " + value);
        }
    }
}
