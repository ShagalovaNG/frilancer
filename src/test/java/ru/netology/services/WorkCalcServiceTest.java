package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkCalcServiceTest {
    @Test
    public void testPrimerOne() {
        WorkCalcService service = new WorkCalcService();
        int expected = 3;
        int actual = service.workCalculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrimerTwo() {
        WorkCalcService service = new WorkCalcService();
        int expected = 2;
        int actual = service.workCalculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}


