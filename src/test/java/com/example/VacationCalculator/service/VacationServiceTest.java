package com.example.VacationCalculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {

    private VacationService vacationService;

    @BeforeEach
    public void setup() {
        HolidayService holidayService = new HolidayService();
        vacationService = new VacationService(holidayService);
    }

    @Test
    public void testCalculateVacationPay() {
        double averageSalary = 100000;
        int vacationDays = 16;
        LocalDate startDate = LocalDate.of(2024, 3, 26);
        String expected = "Сумма отпускных - 40955.63";
        String actual = vacationService.calculationVacationPay(averageSalary, vacationDays, startDate);
        assertEquals(expected, actual);
    }

}