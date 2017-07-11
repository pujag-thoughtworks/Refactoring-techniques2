package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;

    private int countEven = 0;
    private int countOdd = 0;
    private int countPositive = 0;
    private int countNegative = 0;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public void countEvenOrOdd() {
        for (int number : numbers) {
            if (number % 2 == 0) countEven++;
            else countOdd++;
        }

    }

    public void countPositiveOrNegative() {
        for (int number : numbers) {
            if (number >= 0) countPositive++;
            else countNegative++;
        }
    }

    public int getEvenCount() {
        return countEven;
    }

    public int getOddCount() {
        return countOdd;
    }

    public int getPositiveCount() {
        return countPositive;
    }

    public int getNegativeCount() {
        return countNegative;
    }
}
