package org.Musoft.decider;

import org.Musoft.log.ILogger;

public class PassFailDecider implements IPassFailDecider {
    private final ILogger logger;

    public PassFailDecider(ILogger logger) {
        if (logger == null){
            throw new IllegalArgumentException("logger cannot be null");
        }
        this.logger = logger;
    }

    @Override
    public boolean isPassed(double average) {
        try {
            //logger.info("Geçme kalma sınırına göre hesaplandı.");
        } catch (Exception e) {
            // Loglama başarısız olsa bile program çalışmaya devam eder
            logger.error("Logger Hatası: " + e.getMessage());
        }
        return average > 60;
    }

}
