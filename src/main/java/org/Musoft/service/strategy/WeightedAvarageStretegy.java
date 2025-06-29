package org.Musoft.service.strategy;

import org.Musoft.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class WeightedAvarageStretegy implements IAvarageStrategy {

    private static final double[] WEIGHTS = {0.2, 0.3, 0.5};

    @Override
    public List<Double> calculateAverage(List<Student> students) {
        return students.stream()
                .map(student -> {
                    List<Double> grades = student.getGrades();

                    if (grades == null || grades.isEmpty() || grades.size() < WEIGHTS.length) {
                        return 0.0;
                    }

                    double total = 0.0;
                    double totalWeight = 0.0;

                    for (int i = 0; i < WEIGHTS.length; i++) {
                        total += grades.get(i) * WEIGHTS[i];
                        totalWeight += WEIGHTS[i];
                    }

                    return totalWeight == 0.0 ? 0.0 : total / totalWeight;
                })
                .collect(Collectors.toList());
    }
}
