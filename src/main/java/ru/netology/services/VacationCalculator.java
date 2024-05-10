package ru.netology.services;

public class VacationCalculator {

    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int monthsOfVacation = 0;
        int savings = 0;

        for (int month = 1; month <= 12; month++) {
            if (savings >= threshold) {
                monthsOfVacation++;
                savings = savings - expenses;
            } else {
                savings += income / 3;
            }
        }
        return monthsOfVacation;
    }
}