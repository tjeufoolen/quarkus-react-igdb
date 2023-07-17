package dev.foolen;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/games")
public class GameResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String games() {
        return "Hello, World!";
    }
}
