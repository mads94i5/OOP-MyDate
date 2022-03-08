package com.company;

public class TestClass {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.testDate();
    }
    private void testDate() {
        MyDate myDate = new MyDate(1, 1, 2020);
        for (int i = 0; i < 365*8+2; i++) {
            System.out.println(myDate);
            myDate.setToNextDay();
        }
    }
}
