package com.sheilambadi.schoolproject.api;

import com.sheilambadi.schoolproject.ejb.SchoolEjb;
import com.sheilambadi.schoolproject.entities.Exam;
import com.sheilambadi.schoolproject.entities.Result;
import com.sheilambadi.schoolproject.entities.Student;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Path("/students")
    public List<Student> getStudentsList(){
        List<Student> students = schoolEjb.getStudents();
        return students;
    }
    
    @GET()
    @Path("/exams")
    public List<Exam> getExamsList(){
        List<Exam> exams = schoolEjb.getExams();
        return exams;
    }
    
    @GET()
    @Path("/results")
    public List<Result> getResultsList(){
        List<Result> results = schoolEjb.getResults();
        return results;
    }
    
    @GET()
    @Path("/students/{id}")
    public List<Result> getStudentResults(@PathParam("id") int id){
        List<Result> results = schoolEjb.getStudentResults(id);
        return results;
    }
    
}
