package org.Musoft.printer;

import org.Musoft.model.Student;

public class ConsolResultPrinter implements IConsolResultPrinter {
    @Override
    public void printConsolResult(Student student, boolean passed, double avarage) {
        if (student == null) {
            System.out.println("Öğrenci bilgisi yok.");
            return;
        }

        String name = student.getName() != null ? student.getName() : "İsimsiz Öğrenci";
        String state = passed ? "Geçti" : "Kaldı";

        System.out.println(name + " => " + state + " (Ortalama: " + String.format("%.2f",avarage) + ")");
    }
}
