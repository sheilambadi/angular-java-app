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
import javax.ws.rs.POST;
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
    
     @GET()
    @Path("/exams/{id}")
    public List<Result> getResultsByExam(@PathParam("id") int id){
        List<Result> results = schoolEjb.resultByExam(id);
        return results;
    }
    
    @GET()
    @Path("/students/{studentId}/{examId}")
    public List<Result> getStudentResults(@PathParam("studentId") int studentId, @PathParam("examId") int examId){
        List<Result> results = schoolEjb.getStudentResultsExam(studentId, examId);
        return results;
    }
    
    @POST
    @Path("/students/new")
    public Student newStudent(Student student){
        schoolEjb.addNewStudent(student);
        return student;
    }
    
    @POST
    @Path("/exams/new")
    public Exam newExam(Exam exam){
        schoolEjb.addNewExam(exam);
        return exam;
    }
    
    @POST
    @Path("/results/new")
    public Result newExam(Result result){
        schoolEjb.addNewResult(result);
        return result;
    }
    
    @GET
    @Path("/student/data/{id}")
    public Student studentById(@PathParam("id") int id){
        Student student = schoolEjb.studentById(id);
        return student;
    }
    
    @GET
    @Path("/exam/data/{id}")
    public Exam examById(@PathParam("id") int id){
        Exam exam = schoolEjb.examById(id);
        return exam;
    }
}
