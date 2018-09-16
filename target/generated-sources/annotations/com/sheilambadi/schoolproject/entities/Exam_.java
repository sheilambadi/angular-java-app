package com.sheilambadi.schoolproject.entities;

import com.sheilambadi.schoolproject.entities.Result;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-16T08:51:08")
@StaticMetamodel(Exam.class)
public class Exam_ { 

    public static volatile SingularAttribute<Exam, String> examName;
    public static volatile SingularAttribute<Exam, Integer> id;
    public static volatile ListAttribute<Exam, Result> resultList;

}