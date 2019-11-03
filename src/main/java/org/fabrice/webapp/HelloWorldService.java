package org.fabrice.webapp;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
    public static int  glob = initGlob();


    public static int initGlob(){
        System.out.println("Global VAR");
        return 5;
    }

    @GET
    @Path("/{param}")
    public Response getMessage(@PathParam("param") String message) {
        System.out.println("SALLLLLLLLUUUUUTTTTTT");
        String output = "Jersey says " + message;
        return Response.status(200).entity(output).build();
    }
}