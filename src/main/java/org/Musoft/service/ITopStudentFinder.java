package org.Musoft.service;

import org.Musoft.model.Student;

import java.util.AbstractMap;
import java.util.List;
import java.util.Optional;

public interface ITopStudentFinder {
    Optional<AbstractMap.SimpleEntry<Student, Double>> findTopStudent(List<Student> students, List<Double> averages);
}
