package org.Musoft.starter;

import org.Musoft.log.ConsoleLogger;
import org.Musoft.log.ILogger;
import org.Musoft.model.Student;
import org.Musoft.printer.ConsolResultPrinter;
import org.Musoft.decider.PassFailDecider;

import org.Musoft.service.AverageCalculatorService;
import org.Musoft.service.TopStudentFinder;
import org.Musoft.service.strategy.SimpleAverageStrategy;
import org.Musoft.service.strategy.WeightedAvarageStretegy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ILogger logger = new ConsoleLogger();
        List<Student> students = Arrays.asList(
                new Student("Ali", Arrays.asList(70.0, 80.0, 90.0)),
                new Student("Ayşe", Arrays.asList(85.0, 75.0)),
                new Student("Mehmet", Arrays.asList(60.0, 65.0, 70.0)),
                new Student("Elif", Arrays.asList(90.0, 92.0, 88.0)),
                new Student("Can", Arrays.asList(55.0, 60.0)),
                new Student("Deniz", Arrays.asList(78.0, 82.0, 85.0)),
                new Student("Fatma", Arrays.asList(95.0, 93.0)),
                new Student("Ahmet", Arrays.asList(45.0, 50.0, 55.0)),
                new Student("Selin", Arrays.asList(72.0, 75.0, 70.0)),
                new Student("Murat", Arrays.asList(88.0, 85.0, 90.0)),
                new Student("Zeynep", Arrays.asList(80.0, 78.0)),
                new Student("Yusuf", Arrays.asList(65.0, 70.0, 68.0)),
                new Student("Seda", Arrays.asList(92.0, 90.0, 95.0)),
                new Student("Burak", Arrays.asList(50.0, 55.0)),
                new Student("Özge", Arrays.asList(85.0, 88.0, 90.0)),
                new Student("Emre", Arrays.asList(60.0, 62.0)),
                new Student("Hülya", Arrays.asList(75.0, 78.0, 80.0)),
                new Student("Kerem", Arrays.asList(58.0, 60.0)),
                new Student("Derya", Arrays.asList(82.0, 85.0, 88.0)),
                new Student("Gökhan", Arrays.asList(70.0, 68.0))
        );


        AverageCalculatorService calculator = new AverageCalculatorService(new SimpleAverageStrategy(), logger);
        PassFailDecider passFailDecider = new PassFailDecider(logger);
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

        logger.info("Program Sonlandı");
    }
}
