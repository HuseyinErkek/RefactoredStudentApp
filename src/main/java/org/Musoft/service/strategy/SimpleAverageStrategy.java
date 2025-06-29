package org.Musoft.service.strategy;

import org.Musoft.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleAverageStrategy implements IAvarageStrategy {

    @Override
    public List<Double> calculateAverage(List<Student> students) {
        return students.stream()
                .map(student -> {
                    List<Double> grades = student.getGrades();
                    if (grades == null || grades.isEmpty()) {
                        return 0.0;
                    }
                    return grades.stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .orElse(0.0);
                })
                .collect(Collectors.toList());
    }
}
