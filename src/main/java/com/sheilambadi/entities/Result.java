/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sheilambadi.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sheilambadi
 */
@Entity
@Table(name = "result")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Result.findAll", query = "SELECT r FROM Result r")
    , @NamedQuery(name = "Result.findById", query = "SELECT r FROM Result r WHERE r.id = :id")
    , @NamedQuery(name = "Result.findByEnglish", query = "SELECT r FROM Result r WHERE r.english = :english")
    , @NamedQuery(name = "Result.findByKiswahili", query = "SELECT r FROM Result r WHERE r.kiswahili = :kiswahili")
    , @NamedQuery(name = "Result.findByMath", query = "SELECT r FROM Result r WHERE r.math = :math")
    , @NamedQuery(name = "Result.findByChemistry", query = "SELECT r FROM Result r WHERE r.chemistry = :chemistry")
    , @NamedQuery(name = "Result.findByBiology", query = "SELECT r FROM Result r WHERE r.biology = :biology")
    , @NamedQuery(name = "Result.findByPhysics", query = "SELECT r FROM Result r WHERE r.physics = :physics")
    , @NamedQuery(name = "Result.findByGeography", query = "SELECT r FROM Result r WHERE r.geography = :geography")
    , @NamedQuery(name = "Result.findByHistory", query = "SELECT r FROM Result r WHERE r.history = :history")
    , @NamedQuery(name = "Result.findByCre", query = "SELECT r FROM Result r WHERE r.cre = :cre")})
public class Result implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "english")
    private float english;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kiswahili")
    private float kiswahili;
    @Basic(optional = false)
    @NotNull
    @Column(name = "math")
    private float math;
    @Basic(optional = false)
    @NotNull
    @Column(name = "chemistry")
    private float chemistry;
    @Basic(optional = false)
    @NotNull
    @Column(name = "biology")
    private float biology;
    @Basic(optional = false)
    @NotNull
    @Column(name = "physics")
    private float physics;
    @Basic(optional = false)
    @NotNull
    @Column(name = "geography")
    private float geography;
    @Basic(optional = false)
    @NotNull
    @Column(name = "history")
    private float history;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cre")
    private float cre;
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Student studentId;
    @JoinColumn(name = "exam_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Exam examId;

    public Result() {
    }

    public Result(Integer id) {
        this.id = id;
    }

    public Result(Integer id, float english, float kiswahili, float math, float chemistry, float biology, float physics, float geography, float history, float cre) {
        this.id = id;
        this.english = english;
        this.kiswahili = kiswahili;
        this.math = math;
        this.chemistry = chemistry;
        this.biology = biology;
        this.physics = physics;
        this.geography = geography;
        this.history = history;
        this.cre = cre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getKiswahili() {
        return kiswahili;
    }

    public void setKiswahili(float kiswahili) {
        this.kiswahili = kiswahili;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getBiology() {
        return biology;
    }

    public void setBiology(float biology) {
        this.biology = biology;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public float getGeography() {
        return geography;
    }

    public void setGeography(float geography) {
        this.geography = geography;
    }

    public float getHistory() {
        return history;
    }

    public void setHistory(float history) {
        this.history = history;
    }

    public float getCre() {
        return cre;
    }

    public void setCre(float cre) {
        this.cre = cre;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public Exam getExamId() {
        return examId;
    }

    public void setExamId(Exam examId) {
        this.examId = examId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Result)) {
            return false;
        }
        Result other = (Result) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sheilambadi.entities.Result[ id=" + id + " ]";
    }
    
}
