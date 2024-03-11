package SetAlarm;

import static org.junit.Assert.*;
import org.junit.Test;

public class AlarmTest {
    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Solution.setAlarm(true, false));
        assertFalse("Should be false.", Solution.setAlarm(true, true));
        assertFalse("Should be false.", Solution.setAlarm(false, false));
        assertFalse("Should be false.", Solution.setAlarm(false, true));
    }
}
