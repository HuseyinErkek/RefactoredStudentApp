package org.Musoft.service.strategy;

import org.Musoft.model.Student;

import java.util.List;

public interface IAvarageStrategy {
    List<Double> calculateAverage(List<Student> students);
}
