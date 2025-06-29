import org.Musoft.model.Student;
import org.Musoft.service.strategy.WeightedAvarageStretegy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightedAverageStrategyTest {
    @Test
    public void testWeightedAverageStrategy() {
        List<Student> students = Arrays.asList(
                new Student("Ali", Arrays.asList(50.0, 60.0, 70.0)),
                new Student("Ayşe", Arrays.asList(80.0, 90.0, 100.0)));
        WeightedAvarageStretegy strategy = new WeightedAvarageStretegy();
        List<Double> averages = strategy.calculateAverage(students);

        // Hesaplama: Ali -> 50*0.2 + 60*0.3 + 70*0.5 = 10 + 18 + 35 = 63
        // Ayşe -> 80*0.2 + 90*0.3 + 100*0.5 = 16 + 27 + 50 = 93
        assertEquals(63.0, averages.get(0));
        assertEquals(93.0, averages.get(1));
    }
}
