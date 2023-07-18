package dev.foolen.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TwitterTokenResponse {
    @JsonProperty("access_token")
    public String accessToken;
    @JsonProperty("expires_in")
    public String expiresIn;
    @JsonProperty("token_type")
    public String tokenType;
}
