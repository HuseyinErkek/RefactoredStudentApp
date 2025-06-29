package org.Musoft;

import org.Musoft.model.Student;
import org.Musoft.printer.ConsolResultPrinter;
import org.Musoft.decider.PassFailDecider;
import org.Musoft.service.AvarageCalculatorService;
import org.Musoft.service.TopStudentFinder;
import org.Musoft.service.strategy.SimpleAverageStrategy;
import org.Musoft.service.strategy.WeightedAvarageStretegy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ali", Arrays.asList(70.0, 80.0, 90.0)),
                new Student("Ayşe", Arrays.asList(85.0, 75.0)),
                new Student("Mehmet", Arrays.asList(60.0, 65.0, 70.0))
        );

        AvarageCalculatorService calculator = new AvarageCalculatorService(new WeightedAvarageStretegy());
        PassFailDecider passFailDecider = new PassFailDecider();
        ConsolResultPrinter resultPrinter = new ConsolResultPrinter();
        TopStudentFinder topStudentFinder = new TopStudentFinder();

        List<Double> averages = calculator.calculate(students);

        for (int i = 0; i < students.size(); i++) {
            boolean passed = passFailDecider.isPassed(averages.get(i));
            resultPrinter.printConsolResult(students.get(i), passed, averages.get(i));
        }

        topStudentFinder.findTopStudent(students, averages)
                .ifPresent(entry -> System.out.println("En yüksek ortalamaya sahip öğrenci: "
                        + entry.getKey().getName() + " Ortalaması: " + entry.getValue()));
    }
}
