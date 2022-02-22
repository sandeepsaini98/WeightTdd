import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeightTest {

    @Test
    void testEqualityOf5kg() {
        Weight fiveKg = new Weight(5, Unit.KILOGRAM);
        Weight anotherFiveKg = new Weight(5, Unit.KILOGRAM);

        assertEquals(fiveKg, anotherFiveKg);
    }

    @Test
    void testNonEqualityOf3GmAnd2Gm() {
        Weight threeGm = new Weight(3, Unit.GRAM);
        Weight twoGm = new Weight(2, Unit.GRAM);

        assertNotEquals(twoGm, threeGm);
    }

    @Test
    void testNonEqualityOf1GmAnd1kg() {
        Weight oneGm = new Weight(1, Unit.GRAM);
        Weight oneKg = new Weight(1, Unit.KILOGRAM);

        assertNotEquals(oneGm, oneKg);
    }

    @Test
    void testNonEqualityOf3kgAnd2Kg() {
        Weight threeKg = new Weight(3, Unit.KILOGRAM);
        Weight twoKg = new Weight(2, Unit.KILOGRAM);

        assertNotEquals(threeKg, twoKg);
    }

    @Test
    void testNonEqualityOf1KgAnd1Gm() {
        Weight oneKg = new Weight(1, Unit.KILOGRAM);
        Weight oneGm = new Weight(1, Unit.GRAM);

        assertNotEquals(oneKg, oneGm);
    }

    @Test
    void testEqualityOf1kgAnd1000Gm() {
        Weight oneKg = new Weight(1, Unit.KILOGRAM);
        Weight thousandGram = new Weight(1000, Unit.GRAM);

        assertEquals(oneKg, thousandGram);
    }

    @Test
    void testEqualityOf1200GmAnd1_2Kg() {
        Weight twelveHundredGram = new Weight(1200, Unit.GRAM);
        Weight oneAndHalfKg = new Weight(1.2, Unit.KILOGRAM);

        assertEquals(twelveHundredGram, oneAndHalfKg);
    }

    @Test
    void shouldReturnFalseWhenKilogramValueComparedToNull() {
        Weight oneKg = new Weight(1, Unit.KILOGRAM);

        assertNotEquals(oneKg, null);
    }

    @Test
    void shouldReturn5KgWhen2kgAnd3KgAreAdded() {
        Weight twoKg = new Weight(2, Unit.KILOGRAM);
        Weight threeKg = new Weight(3, Unit.KILOGRAM);

        Weight actualResult = twoKg.sum(threeKg);
        Weight expectedResult = new Weight(5, Unit.KILOGRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn5GmWhen2GmAnd3GmAreAdded() {
        Weight twoGm = new Weight(2, Unit.GRAM);
        Weight threeGm = new Weight(3, Unit.GRAM);

        Weight actualResult = twoGm.sum(threeGm);
        Weight expectedResult = new Weight(5, Unit.GRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1_1KgWhen1KgAnd100GmAreAdded() {
        Weight oneKg = new Weight(1, Unit.KILOGRAM);
        Weight hunderedGram = new Weight(100, Unit.GRAM);

        Weight actualResult = oneKg.sum(hunderedGram);
        Weight expectedResult = new Weight(1.1, Unit.KILOGRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn2_2KgWhen2KgAnd200GmAreAdded() {
        Weight twoKg = new Weight(2, Unit.KILOGRAM);
        Weight twoHunderedGram = new Weight(200, Unit.GRAM);

        Weight actualResult = twoKg.sum(twoHunderedGram);
        Weight expectedResult = new Weight(2.2, Unit.KILOGRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1_000001KgWhen1KgAnd1MgAreAdded() {
        Weight oneKg = new Weight(1, Unit.KILOGRAM);
        Weight oneMilliGram = new Weight(1, Unit.MILLIGRAM);

        Weight actualResult = oneKg.sum(oneMilliGram);
        Weight expectedResult = new Weight(1.000001, Unit.KILOGRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1100GmWhen100GmAnd1KgAreAdded() {
        Weight hunderedGram = new Weight(100, Unit.GRAM);
        Weight oneKg = new Weight(1, Unit.KILOGRAM);

        Weight actualResult = hunderedGram.sum(oneKg);
        Weight expectedResult = new Weight(1100, Unit.GRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn100_1GmWhen100GmAnd100MgAreAdded() {
        Weight hunderedGram = new Weight(100, Unit.GRAM);
        Weight hunderedMilliGram = new Weight(100, Unit.MILLIGRAM);

        Weight actualResult = hunderedGram.sum(hunderedMilliGram);
        Weight expectedResult = new Weight(100.1, Unit.GRAM);
    }

    @Test
    void shouldReturn2200GmWhen200GmAnd2kgAreAdded() {
        Weight twoHunderedGram = new Weight(200, Unit.GRAM);
        Weight twoKg = new Weight(2, Unit.KILOGRAM);

        Weight actualResult = twoHunderedGram.sum(twoKg);
        Weight expectedResult = new Weight(2200, Unit.GRAM);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1KgWhen500gmAnd500GmAreAdded() {
        Weight fiveHunderedGram = new Weight(500, Unit.GRAM);
        Weight fiveHunderedGram1 = new Weight(500, Unit.GRAM);

        Weight actualResult = fiveHunderedGram.sum(fiveHunderedGram1);
        Weight expectedResult = new Weight(1, Unit.KILOGRAM);

        assertEquals(expectedResult, actualResult);
    }
}
