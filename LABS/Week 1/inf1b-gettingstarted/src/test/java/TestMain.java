import org.junit.Test;
import static org.junit.Assert.*;

import junit.runner.Version;

public class TestMain {

    @Test
    public void testMain() {
        assertEquals("JUnit 4 not configured as expected.","4.12", Version.id());
    }
}
