import org.Musoft.model.Student;
import org.Musoft.service.strategy.SimpleAverageStrategy;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleAverageStrategyTest {
    @Test
    public void testSimpleAverageStrategy() {
        List<Student> students = Arrays.asList(
                new Student("Ali", Arrays.asList(50.0, 60.0)),
                new Student("Ayşe", Arrays.asList(80.0, 90.0))
        );

        SimpleAverageStrategy strategy = new SimpleAverageStrategy();
        List<Double> averages = strategy.calculateAverage(students);

        // Ali ortalaması: (50 + 60) / 2 = 55.0
        // Ayşe ortalaması: (80 + 90) / 2 = 85.0
        assertEquals(55.0, averages.get(0));
        assertEquals(85.0, averages.get(1));
    }
}
