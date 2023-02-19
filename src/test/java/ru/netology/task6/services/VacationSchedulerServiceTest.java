package ru.netology.task6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationSchedulerServiceTest {

    @Test
    public void testLowIncome() {
        VacationSchedulerService service = new VacationSchedulerService();

        int expected = 3;
        int actual = service.calculate(10, 3, 20);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testHighIncome() {
        VacationSchedulerService service = new VacationSchedulerService();

        int expected = 2;
        int actual = service.calculate(100, 60, 150);

        Assertions.assertEquals(actual, expected);
    }
}
