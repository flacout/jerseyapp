package org.fabrice.webapp;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("{any: .*}")
public class AnyController {
    @Context
    private ServletContext context;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String Boy(@PathParam("any") String path, @Context HttpHeaders httpheaders) {
        //String accept = httpheaders.getHeaderString("Accept");
        List<String> accept = httpheaders.getRequestHeader("Accept");
        System.out.println(path);
        System.out.println(accept);

        // dirty way
        String tripleStore = StartupContext.TRIPLE_STORE;
        System.out.println(tripleStore);

        // clean way
        String db = (String) context.getAttribute("database");
        System.out.println(db);
        return "Boy return from api";
    }
}
