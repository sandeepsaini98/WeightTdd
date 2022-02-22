import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {

    @Test
    void shouldReturn5WhenValueIs5AndConversionFactor1IsPassed() {
        Unit milliGram = Unit.MILLIGRAM;

        double value = 5;
        double actualResult = milliGram.convertToBase(value);
        double expectedResult = value * milliGram.conversionFactor;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn500000WhenValueIs500AndConvertedFactor1000IsPassed() {
        Unit gramToMilligram = Unit.MILLIGRAM;

        double value = 500;
        double actualResult = gramToMilligram.convertToBase(value);
        double expectedResult = value * gramToMilligram.conversionFactor;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn5000000WhenValueIs5AndConversionFactor1000000IsPassed() {
        Unit kilogramToMilligram = Unit.MILLIGRAM;

        double value = 5;
        double actualResult = kilogramToMilligram.convertToBase(value);
        double expectedResult = value * kilogramToMilligram.conversionFactor;

        assertEquals(expectedResult, actualResult);
    }
}
