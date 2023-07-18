package dev.foolen.services;

import dev.foolen.entities.IGDBGame;
import io.quarkus.rest.client.reactive.NotBody;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

@Path("v4")
@RegisterRestClient(configKey="igdb-api")
public interface IGDBService {
    @POST
    @Path("games")
    @ClientHeaderParam(name = "Client-ID", value = "{clientId}")
    @ClientHeaderParam(name = "Authorization", value = "Bearer {token}")
    Set<IGDBGame> getGames(@NotBody String clientId, @NotBody String token, String body);
}
