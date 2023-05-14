package com.rean.data.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ChatUserRequest(@JsonProperty("message") String message) {
}
