import org.Musoft.decider.PassFailDecider;
import org.Musoft.log.ConsoleLogger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PassFailDeciderTest {
@Test
public void testIsPassed() {
    PassFailDecider decider = new PassFailDecider(new ConsoleLogger());

    assertTrue(decider.isPassed(61.0));
    assertFalse(decider.isPassed(60.0));
    assertFalse(decider.isPassed(0));
}
}

