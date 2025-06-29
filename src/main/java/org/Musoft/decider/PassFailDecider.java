package org.Musoft.service;

public class PassFailDecider implements IPassFailDecider {
    @Override
    public boolean isPassed(double avarage) {
        return avarage > 60;
    }
}
