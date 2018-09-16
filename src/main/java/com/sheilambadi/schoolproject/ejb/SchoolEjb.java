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
    
}
