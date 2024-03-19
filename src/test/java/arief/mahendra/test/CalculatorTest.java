package arief.mahendra.test;

import arief.mahendra.test.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void setUp(){
        System.out.println("Before All scenario");
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("After All scenario");
    }

    @Test
    @DisplayName("Test scenario sukses untuk method add(Integer, Integer)")
    public void testAddSuccess(){
        Integer result = calculator.add(10, 10);

        assertEquals(20, result);
        assertNotNull(result);
    }

    @Test
    public void testDivideSuccess(){
        Integer result = calculator.divide(100, 10);

        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(0, 10);
        });
    }

    @Test
    @Disabled
    public void testComingSoonSuccess(){

    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            throw new TestAbortedException("test dibatalkan karena bukan DEV");
        }
    }
}
