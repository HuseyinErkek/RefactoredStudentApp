package org.Musoft.strategy;

import org.Musoft.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleAverageStrategy implements IAvarageStrategy {

    @Override
    public List<Double> calculateAverage(List<Student> students) {
        return students.stream()
                .map(student -> student.getGrades().stream()
                        .mapToDouble(Double::doubleValue)
                        .average()
                        .orElse(0.0))
                .collect(Collectors.toList());
    }
}
