package com.example.VacationCalculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class VacationService {

    private final HolidayService holidayService;

    public String calculationVacationPay(double averageSalary, int vacationDays, LocalDate startDate) {
        int workDays = calculateWorkDays(vacationDays, startDate);
        BigDecimal vacationPay = BigDecimal.valueOf((averageSalary / 29.3) * workDays);
        BigDecimal roundedVacationPay = vacationPay.setScale(2, RoundingMode.HALF_UP);
        return "Сумма отпускных - " + roundedVacationPay;
    }

    private int calculateWorkDays(int vacationDays, LocalDate startDate) {
        int workDays = 0;

        for (int i = 0; i < vacationDays; i++) {
            LocalDate currentDate = startDate.plusDays(i);

            if (!holidayService.isWeekend(currentDate)) {
                workDays++;
            }
        }

        return workDays;
    }
}
