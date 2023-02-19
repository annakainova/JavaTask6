package ru.netology.task6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationSchedulerServiceTest {

    @CsvFileSource(files = "src/test/resources/vacation.csv")

    @ParameterizedTest
    public void testVacationCount(int expected, int income, int expenses, int threshold) {
        VacationSchedulerService service = new VacationSchedulerService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(actual, expected);
    }

}
