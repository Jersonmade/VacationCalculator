package com.example.VacationCalculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
public class HolidayService {

    private final Set<LocalDate> holidays = new HashSet<>();

    public HolidayService() {
        holidays.add(LocalDate.of(2024, 1, 1));
        holidays.add(LocalDate.of(2024, 1, 2));
        holidays.add(LocalDate.of(2024, 1, 3));
        holidays.add(LocalDate.of(2024, 1, 4));
        holidays.add(LocalDate.of(2024, 1, 5));
        holidays.add(LocalDate.of(2024, 1, 6));
        holidays.add(LocalDate.of(2024, 1, 7));
        holidays.add(LocalDate.of(2024, 1, 8));
        holidays.add(LocalDate.of(2024, 2, 23));
        holidays.add(LocalDate.of(2024, 2, 24));
        holidays.add(LocalDate.of(2024, 2, 25));
        holidays.add(LocalDate.of(2024, 3, 8));
        holidays.add(LocalDate.of(2024, 3, 9));
        holidays.add(LocalDate.of(2024, 3, 10));
        holidays.add(LocalDate.of(2024, 4, 28));
        holidays.add(LocalDate.of(2024, 4, 29));
        holidays.add(LocalDate.of(2024, 4, 30));
        holidays.add(LocalDate.of(2024, 5, 1));
        holidays.add(LocalDate.of(2024, 5, 9));
        holidays.add(LocalDate.of(2024, 5, 10));
        holidays.add(LocalDate.of(2024, 5, 11));
        holidays.add(LocalDate.of(2024, 5, 12));
        holidays.add(LocalDate.of(2024, 6, 12));
        holidays.add(LocalDate.of(2024, 11, 3));
        holidays.add(LocalDate.of(2024, 11, 4));
        holidays.add(LocalDate.of(2024, 12, 29));
        holidays.add(LocalDate.of(2024, 12, 30));
        holidays.add(LocalDate.of(2024, 12, 31));
    }

    public Boolean isWeekend(LocalDate date) {
        return date.getDayOfWeek().getValue() > 5 || holidays.contains(date);
    }
}
