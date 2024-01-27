package com.example.libraryconsumerapi.common.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlackMessageRequest {
    private String pretext;
    private String color;
    private List<Field> fields;

    public SlackMessageRequest(String pretext, String color, String title, String value) {
        this.pretext = pretext;
        this.color = color;
        this.fields = List.of(new Field(title, value, false));
    }

    @Getter
    @Setter
    @AllArgsConstructor
    private static class Field {
        private String title;
        private String value;
        @JsonProperty("short")
        private boolean shortFlag;
    }
}
