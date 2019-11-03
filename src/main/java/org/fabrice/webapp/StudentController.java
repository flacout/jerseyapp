package org.fabrice.webapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;


@Path("/student")
//@Produces("application/json")
public class StudentController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList listStudents() {
        ArrayList<Student> st = new ArrayList<Student>();
        st.add(new Student("fabrice", "Diaz",22,1));
        st.add(new Student("fabricea", "Dddsiaz",22,1));
        return st;
    }


    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent() {
        Student st = new Student("fabrice", "Diaz",22,1);
        return st;
    }
}