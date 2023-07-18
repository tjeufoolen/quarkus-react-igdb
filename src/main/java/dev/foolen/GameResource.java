package dev.foolen;

import dev.foolen.entities.Game;
import dev.foolen.entities.IGDBGame;
import dev.foolen.entities.TwitterTokenResponse;
import dev.foolen.services.IGDBService;
import dev.foolen.services.TwitterOAuthService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;
import java.util.Set;

@Path("/games")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "games")
public class GameResource {
    @RestClient
    IGDBService igdbService;

    @RestClient
    TwitterOAuthService twitterOAuthService;

    @GET
    @Operation(operationId = "getAll")
    public Set<IGDBGame> getAll(@QueryParam("client_id") String clientId, @QueryParam("client_secret") String clientSecret) {
//        return Game.findAll().list();
        TwitterTokenResponse tokenResponse =  twitterOAuthService.requestAccessToken(clientId, clientSecret, "client_credentials");
        return igdbService.getGames(clientId,tokenResponse.accessToken,"fields id,name,slug,summary;");
    }
}
