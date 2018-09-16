package com.sheilambadi.schoolproject.api;

import com.sheilambadi.schoolproject.ejb.SchoolEjb;
import com.sheilambadi.schoolproject.entities.Student;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Path("/school")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SchoolApi {
    
    @EJB
    SchoolEjb schoolEjb;
    
    @GET()
    @Path("/student")
    public List<Student> getSchoolResults(){
        List<Student> students = schoolEjb.getStudents();
        return students;
    }
    
}
