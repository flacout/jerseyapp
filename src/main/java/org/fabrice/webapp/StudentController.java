package org.fabrice.webapp;

import javax.ws.rs.*;
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

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student createStudent(Student st) {
        System.out.println(st);
        String name = st.getFirstName();
        System.out.println(name);
        return st;

    }
}