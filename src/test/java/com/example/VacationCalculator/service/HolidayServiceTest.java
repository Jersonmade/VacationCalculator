package com.example.VacationCalculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class HolidayServiceTest {

    private HolidayService holidayService;

    @BeforeEach
    public void setup() {
        holidayService = new HolidayService();
    }

    @Test
    public void TestIsHoliday() {
        LocalDate holidayDate = LocalDate.of(2024, 3, 30);
        boolean isWeekend = holidayService.isWeekend(holidayDate);
        assertTrue(isWeekend);
    }

    @Test
    public void TestIsNotHoliday() {
        LocalDate holidayDate = LocalDate.of(2024, 3, 26);
        boolean isWeekend = holidayService.isWeekend(holidayDate);
        assertFalse(isWeekend);
    }

}