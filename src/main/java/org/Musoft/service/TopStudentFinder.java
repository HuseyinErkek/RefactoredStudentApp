package org.Musoft.service;

import org.Musoft.model.Student;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class TopStudentFinder implements ITopStudentFinder {
    @Override
    public Optional<AbstractMap.SimpleEntry<Student, Double>> findTopStudent(List<Student> students, List<Double> averages) {
        if (students == null || averages == null || students.size() != averages.size()) {
            throw new IllegalArgumentException("Öğrenci ve ortalama listeleri boş veya uyumsuz.");
        }

        return IntStream.range(0, students.size())
                .mapToObj(i -> new AbstractMap.SimpleEntry<>(students.get(i), averages.get(i)))
                .max(Comparator.comparing(AbstractMap.SimpleEntry::getValue));
    }
}
