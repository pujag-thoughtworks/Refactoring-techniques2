package com.twu.refactoring;

public class NumberCruncher {
    private final int[] numbers;


    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int[] countEvenOrOdd() {
        int countEven = 0;
        int countOdd = 0;
        for (int number : numbers) {
            if (number % 2 == 0) countEven++;
            else countOdd++;
        }
        int[] result = {countEven, countOdd};

        return result;

    }

    public int[] countPositiveOrNegative() {
        int countNegative = 0;
        int countPositive = 0;
        for (int number : numbers) {
            if (number >= 0) countPositive++;
            else countNegative++;
        }
        int[] result = {countPositive, countNegative};

        return result;
    }
}
