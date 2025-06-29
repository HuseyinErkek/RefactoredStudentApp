import org.Musoft.log.ConsoleLogger;
import org.Musoft.model.Student;
import org.Musoft.service.AverageCalculatorService;
import org.Musoft.service.strategy.SimpleAverageStrategy;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class testCalculateAvarageTest {
    @Test
    public void testCalculateAverage() {
        List<Student> students = Arrays.asList(
                new Student("Ali", Arrays.asList(50.0, 60.0)),
                new Student("Ayşe", Arrays.asList(70.0, 80.0))
        );

        AverageCalculatorService service = new AverageCalculatorService(new SimpleAverageStrategy(), new ConsoleLogger());
        List<Double> averages = service.calculate(students);

        assertEquals(2, averages.size());
        assertEquals(55.0, averages.get(0));
        assertEquals(75.0, averages.get(1));
    }
}