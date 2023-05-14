package com.rean.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ChatGptChoice(
        String text,
        Integer index,
        String logprobs,
        @JsonProperty("finish_reason") String finishReason
) {
}