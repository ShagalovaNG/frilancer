package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/primer.csv")
    public void testPrimerOne(int expected, int income, int expenses, int threshold) {
        WorkCalcService service = new WorkCalcService();
        //int expected = 3;
        int actual = service.workCalculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    //  @Test
    // public void testPrimerTwo() {
    //   WorkCalcService service = new WorkCalcService();
    // int expected = 2;
    //int actual = service.workCalculate(100_000, 60_000, 150_000);
    // Assertions.assertEquals(expected, actual);
    //}
}


