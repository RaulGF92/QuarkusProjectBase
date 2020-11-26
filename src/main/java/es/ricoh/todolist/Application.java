package es.ricoh.todolist;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/isAlive")
public class Application {


    @ConfigProperty(name = "app.name")
    String name;
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String isAlive() {
        return name;
    }
}