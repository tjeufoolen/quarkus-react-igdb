package dev.foolen.services;

import dev.foolen.entities.IGDBGame;
import dev.foolen.entities.TwitterTokenResponse;
import io.quarkus.rest.client.reactive.NotBody;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

@Path("oauth2")
@RegisterRestClient(configKey="twitter-oauth-api")
public interface TwitterOAuthService {
    @POST
    @Path("token")
    TwitterTokenResponse requestAccessToken(@QueryParam("client_id") String clientId, @QueryParam("client_secret") String clientSecret, @QueryParam("grant_type") String grantType);
}
