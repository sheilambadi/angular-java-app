package com.sheilambadi.schoolproject.ejb;

import com.sheilambadi.schoolproject.entities.Exam;
import com.sheilambadi.schoolproject.entities.Result;
import com.sheilambadi.schoolproject.entities.Student;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class SchoolEjb {
    @PersistenceContext
    EntityManager em;
    
    // get all students
    public List<Student> getStudents(){
        Query q1 = em.createQuery("SELECT s FROM Student s");
        List<Student> results = q1.getResultList();
        return results;
    }
    
     // get all exams
    public List<Exam> getExams(){
        Query q1 = em.createQuery("SELECT s FROM Exam s");
        List<Exam> results = q1.getResultList();
        return results;
    }
    
     // get all exams
    public List<Result> getResults(){
        Query q1 = em.createQuery("SELECT s FROM Result s");
        List<Result> results = q1.getResultList();
        return results;
    }
    
    // get result based on student id
    public List<Result> getStudentResults(int id){
        Query q1 = em.createQuery("SELECT r FROM Result r WHERE r.studentId.id = :id");
        q1.setParameter("id", id);
        List<Result> results = q1.getResultList();
        return results;
    }
    
    // add new student
    public Student addNewStudent(Student student){
        em.persist(student);
        em.flush();
        return student;
    }
    
    // add new exam
    public Exam addNewExam(Exam exam){
        em.persist(exam);
        em.flush();
        return exam;
    }
    
    // add new exam
    public Result addNewResult(Result result){
        em.persist(result);
        em.flush();
        return result;
    }
    
}
