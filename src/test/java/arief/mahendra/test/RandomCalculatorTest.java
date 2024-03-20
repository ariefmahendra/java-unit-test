package arief.mahendra.test;

import org.junit.jupiter.api.*;

import java.util.Random;

public class RandomCalculatorTest extends AbstractCalculatorClass {

    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomCalculatorRepeat(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();

        Integer result = calculator.add(a, b);

        var expected = a + b;

        Assertions.assertEquals(expected, result);

    }

    @DisplayName("Test Random Calculator")
    @RepeatedTest(value = 10, name = "{displayName}")
    void testRandomCalculatorRepeatInfo(Random random, TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        Integer result = calculator.add(a, b);

        var expected = a + b;

        Assertions.assertEquals(expected, result);

    }
}
