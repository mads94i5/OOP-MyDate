package com.company;

public class MyDate {

    private int day;
    private int month;
    private int year;

    public void setToNextDay() {
        if ((month % 2 == 0) && (month < 8) && (month != 2)) {
            if (day < 30) {
                day += 1;
            }
            else {
                day = 1;
                month += 1;
            }
        }
        else if ((month % 2 != 0) && (month > 8)) {
            if (day < 30) {
                day += 1;
            }
            else {
                day = 1;
                if (month < 12) {
                    month += 1;
                }
                else {
                    year += 1;
                    month = 1;
                }
            }
        }
        else if (month == 2) {
            if (isLeapYear(year)) {
                if (day < 29) {
                    day += 1;
                }
                else {
                    day = 1;
                    month += 1;
                }
            }
            else {
                if (day < 28) {
                    day += 1;
                }
                else {
                    day = 1;
                    month += 1;
                }
            }
        }
        else {
            if (day < 31) {
                day += 1;
            }
            else {
                day = 1;
                if (month < 12) {
                    month += 1;
                }
                else {
                    year += 1;
                    month = 1;
                }
            }
        }
    }
    private boolean isLeapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0) && (year % 400 != 0);
    }
    @Override
    public String toString() {
        return "Date{" +
                "day='" + day + '\'' +
                ", month=" + month + '\'' +
                ", year=" + year +
                '}';
    }
    public MyDate(int currentDay, int currentMonth, int currentYear) {
        day = currentDay;
        month = currentMonth;
        year = currentYear;
    }
}
