package com.twu.refactoring;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class NumberCruncher {
    private final int[] numbers;

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        IntPredicate evenPredicate = number -> number % 2 == 0;
        return count(evenPredicate);
    }


    public int countOdd() {
        IntPredicate oddPredicate = number -> number % 2 == 1;
        return count(oddPredicate);
    }

    public int countPositive() {
        IntPredicate positivePredicate = number -> number >= 0;
        return count(positivePredicate);
    }

    public int countNegative() {
        IntPredicate negativePredicate = number -> number < 0;
        return count(negativePredicate);
    }

    private int count(IntPredicate intPredicate) {
        return (int) Arrays.stream(numbers).filter(intPredicate).count();
    }

}
