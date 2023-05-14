package com.rean.data.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ChatGptRequest(
        @JsonProperty("model") String model,
        @JsonProperty("prompt") String prompt,
        @JsonProperty("max_tokens") Integer maxTokens,
        @JsonProperty("temperature") Double temperature,
        @JsonProperty("top_p") Double topP
) {
}
