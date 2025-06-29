package org.Musoft.log;

public class ConsoleLogger implements ILogger {
    @Override
    public void info(String message) {
        System.out.println("INFO " + message);
    }

    @Override
    public void warn(String message) {
        System.out.println("WARN " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR " + message);
    }
}
