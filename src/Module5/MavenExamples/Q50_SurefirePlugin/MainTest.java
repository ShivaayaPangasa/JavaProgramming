package Module5.MavenExamples.Q50_SurefirePlugin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAddition() {
        Main m = new Main();
        assertEquals(10, m.add(5, 5));
    }
}