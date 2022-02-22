import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WeightTest {

    @Test
    void testEqualityOf5kg() {
        Weight fiveKg = new Weight(5, Kilogram.getInstance());
        Weight anotherFiveKg = new Weight(5, Kilogram.getInstance());

        assertEquals(fiveKg, anotherFiveKg);
    }

    @Test
    void testNonEqualityOf3GmAnd2Gm() {
        Weight threeGm = new Weight(3, Gram.getInstance());
        Weight twoGm = new Weight(2, Gram.getInstance());

        assertNotEquals(twoGm, threeGm);
    }

    @Test
    void testNonEqualityOf1GmAnd1kg() {
        Weight oneGm = new Weight(1, Gram.getInstance());
        Weight oneKg = new Weight(1, Kilogram.getInstance());

        assertNotEquals(oneGm, oneKg);
    }

    @Test
    void testNonEqualityOf3kgAnd2Kg() {
        Weight threeKg = new Weight(3, Kilogram.getInstance());
        Weight twoKg = new Weight(2, Kilogram.getInstance());

        assertNotEquals(threeKg, twoKg);
    }

    @Test
    void testNonEqualityOf1KgAnd1Gm() {
        Weight oneKg = new Weight(1, Kilogram.getInstance());
        Weight oneGm = new Weight(1, Gram.getInstance());

        assertNotEquals(oneKg, oneGm);
    }

    @Test
    void testEqualityOf1kgAnd1000Gm() {
        Weight oneKg = new Weight(1, Kilogram.getInstance());
        Weight thousandGram = new Weight(1000, Gram.getInstance());

        assertEquals(oneKg, thousandGram);
    }

    @Test
    void testEqualityOf1200GmAnd1_2Kg() {
        Weight twelveHundredGram = new Weight(1200, Gram.getInstance());
        Weight oneAndHalfKg = new Weight(1.2, Kilogram.getInstance());

        assertEquals(twelveHundredGram, oneAndHalfKg);
    }

    @Test
    void shouldReturnFalseWhenKilogramValueComparedToNull() {
        Weight oneKg = new Weight(1, Kilogram.getInstance());

        assertNotEquals(oneKg, null);
    }

    @Test
    void shouldReturn5KgWhen2kgAnd3KgAreAdded() {
        Weight twoKg = new Weight(2, Kilogram.getInstance());
        Weight threeKg = new Weight(3, Kilogram.getInstance());

        Weight actualResult = twoKg.sum(threeKg);
        Weight expectedResult = new Weight(5, Kilogram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn5GmWhen2GmAnd3GmAreAdded() {
        Weight twoGm = new Weight(2, Gram.getInstance());
        Weight threeGm = new Weight(3, Gram.getInstance());

        Weight actualResult = twoGm.sum(threeGm);
        Weight expectedResult = new Weight(5, Gram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1_1KgWhen1KgAnd100GmAreAdded() {
        Weight oneKg = new Weight(1, Kilogram.getInstance());
        Weight hunderedGram = new Weight(100, Gram.getInstance());

        Weight actualResult = oneKg.sum(hunderedGram);
        Weight expectedResult = new Weight(1.1, Kilogram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn2_2KgWhen2KgAnd200GmAreAdded() {
        Weight twoKg = new Weight(2, Kilogram.getInstance());
        Weight twoHunderedGram = new Weight(200, Gram.getInstance());

        Weight actualResult = twoKg.sum(twoHunderedGram);
        Weight expectedResult = new Weight(2.2, Kilogram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1_000001KgWhen1KgAnd1MgAreAdded() {
        Weight oneKg = new Weight(1, Kilogram.getInstance());
        Weight oneMilliGram = new Weight(1, MilliGram.getInstance());

        Weight actualResult = oneKg.sum(oneMilliGram);
        Weight expectedResult = new Weight(1.000001, Kilogram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1100GmWhen100GmAnd1KgAreAdded() {
        Weight hunderedGram = new Weight(100, Gram.getInstance());
        Weight oneKg = new Weight(1, Kilogram.getInstance());

        Weight actualResult = hunderedGram.sum(oneKg);
        Weight expectedResult = new Weight(1100, Gram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn100_1GmWhen100GmAnd100MgAreAdded() {
        Weight hunderedGram = new Weight(100, Gram.getInstance());
        Weight hunderedMilliGram = new Weight(100, MilliGram.getInstance());

        Weight actualResult = hunderedGram.sum(hunderedMilliGram);
        Weight expectedResult = new Weight(100.1, Gram.getInstance());
    }

    @Test
    void shouldReturn2200GmWhen200GmAnd2kgAreAdded() {
        Weight twoHunderedGram = new Weight(200, Gram.getInstance());
        Weight twoKg = new Weight(2, Kilogram.getInstance());

        Weight actualResult = twoHunderedGram.sum(twoKg);
        Weight expectedResult = new Weight(2200, Gram.getInstance());

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldReturn1KgWhen500gmAnd500GmAreAdded() {
        Weight fiveHunderedGram = new Weight(500, Gram.getInstance());
        Weight fiveHunderedGram1 = new Weight(500, Gram.getInstance());

        Weight actualResult = fiveHunderedGram.sum(fiveHunderedGram1);
        Weight expectedResult = new Weight(1, Kilogram.getInstance());

        assertEquals(expectedResult, actualResult);
    }
}
