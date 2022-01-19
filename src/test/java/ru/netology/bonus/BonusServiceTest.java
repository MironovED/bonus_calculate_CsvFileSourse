package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
    void calculateBonus(String testName, long amount, boolean registered, long expected) {
        BonusService service = new BonusService();


        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
}

//    @CsvSource({"'registered true, bonus over limit', 10000000, true, 500",
//    "'registered true, bonus under limit', 5000, true, 1"})
//        long amount = 10000000;
//        boolean registered = true;
//        long expected = 500;