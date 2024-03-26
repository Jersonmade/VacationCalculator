package com.example.VacationCalculator.controller;

import com.example.VacationCalculator.service.VacationService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/calculate")
public class VacationController {

    private final VacationService vacationService;

    @GetMapping
    public ResponseEntity<String> calculateVacation(
            @RequestParam("salary") double averageSalary,
            @RequestParam("vacationDays") int vacationDays,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate
    ) {
        return ResponseEntity.ok(vacationService.calculationVacationPay(averageSalary, vacationDays, startDate));
    }

}
