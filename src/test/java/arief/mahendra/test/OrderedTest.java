package arief.mahendra.test;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTest {

    private Integer counter = 0;

    @Test
    @Order(3)
    void order3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    void order1() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    void order2() {
        counter++;
        System.out.println(counter);
    }
}
