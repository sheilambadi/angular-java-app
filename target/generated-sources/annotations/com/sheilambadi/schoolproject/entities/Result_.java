package com.sheilambadi.schoolproject.entities;

import com.sheilambadi.schoolproject.entities.Exam;
import com.sheilambadi.schoolproject.entities.Student;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-28T09:52:59")
@StaticMetamodel(Result.class)
public class Result_ { 

    public static volatile SingularAttribute<Result, Float> chemistry;
    public static volatile SingularAttribute<Result, Student> studentId;
    public static volatile SingularAttribute<Result, Float> biology;
    public static volatile SingularAttribute<Result, Float> geography;
    public static volatile SingularAttribute<Result, Float> kiswahili;
    public static volatile SingularAttribute<Result, Float> physics;
    public static volatile SingularAttribute<Result, Float> cre;
    public static volatile SingularAttribute<Result, Float> english;
    public static volatile SingularAttribute<Result, Exam> examId;
    public static volatile SingularAttribute<Result, Float> history;
    public static volatile SingularAttribute<Result, Integer> id;
    public static volatile SingularAttribute<Result, Float> math;

}