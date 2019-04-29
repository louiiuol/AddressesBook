package fr.simplon.addressBook;

import org.junit.Test;

public class LogBackConfigTest {
    @Test
    public void testPerformTask() throws Exception {
        LogBackConfig logbackConfig = new LogBackConfig();
        logbackConfig.performTask();
    }
}