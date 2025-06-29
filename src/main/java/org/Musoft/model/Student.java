package org.Musoft.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
   private String  name;
   private List<Double> grades;

    public Student(String name, List<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }
}
