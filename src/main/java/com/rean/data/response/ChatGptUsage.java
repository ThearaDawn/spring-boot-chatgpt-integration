package com.rean.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ChatGptUsage(@JsonProperty("prompt_tokens") Integer promptTokens,
                           @JsonProperty("completion_tokens") Integer completionTokens,
                           @JsonProperty("total_tokens") Integer totalTokens) {
}