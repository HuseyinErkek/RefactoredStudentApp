package org.Musoft.service;

import org.Musoft.log.ILogger;
import org.Musoft.model.Student;
import org.Musoft.service.strategy.IAvarageStrategy;

import java.util.List;

public class AverageCalculatorService {
    private IAvarageStrategy strategy;
    private ILogger logger;

    public AverageCalculatorService(IAvarageStrategy strategy, ILogger logger) {
        this.strategy = strategy;
        this.logger = logger;
    }

    public void setStrategy(IAvarageStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Double> calculate(List<Student> students) {
        logger.info("Ortalama hesaplama başladı.");
        List<Double> averages = strategy.calculateAverage(students);
        logger.info("Ortalama hesaplama tamamlandı.");
        return averages;
    }
}
