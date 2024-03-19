package arief.mahendra.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(3)
    void order3() {
    }

    @Test
    @Order(1)
    void order1() {
    }

    @Test
    @Order(2)
    void order2() {
    }
}
