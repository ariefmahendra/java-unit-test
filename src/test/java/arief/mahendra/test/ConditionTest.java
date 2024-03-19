package arief.mahendra.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    public void testWindows() {
        System.out.println("Running on Windows");
    }

    @Test
    @DisabledOnOs(value = {OS.MAC})
    public void testDisableMac(){
        System.out.println("Disable running on Mac");
    }
}
