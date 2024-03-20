package arief.mahendra.test;


import arief.mahendra.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class AbstractCalculatorClass {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("setup each method is running for testing");
    }
}
