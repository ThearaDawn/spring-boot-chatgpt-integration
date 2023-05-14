package com.rean.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

public record ChatGptResponse(
        String id,
        String object,
        String model,
        LocalDate created,
        @JsonProperty("choices") List<ChatGptChoice> choices,
        @JsonProperty("usage") ChatGptUsage usage

        ) {
}