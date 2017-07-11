package com.twu.refactoring;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NumberCruncherTest {
    @Test
    public void shouldCountEvenNumbers() {
        NumberCruncher numberCruncher = new NumberCruncher(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int[] evenOddCount = numberCruncher.countEvenOrOdd();
        assertThat(evenOddCount[0], is(5));
    }

    @Test
    public void shouldCountOddNumbers() {
        NumberCruncher numberCruncher = new NumberCruncher(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        numberCruncher.countEvenOrOdd();
        int[] evenOddCount = numberCruncher.countEvenOrOdd();
        assertThat(evenOddCount[1], is(6));
    }

    @Test
    public void shouldCountPositiveNumbers() {
        NumberCruncher numberCruncher = new NumberCruncher(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4);
        int[] positiveOrNegative = numberCruncher.countPositiveOrNegative();
        assertThat(positiveOrNegative[0], is(5));
    }

    @Test
    public void shouldCountNegativeNumbers() {
        NumberCruncher numberCruncher = new NumberCruncher(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4);
        int[] positiveOrNegative = numberCruncher.countPositiveOrNegative();
        assertThat(positiveOrNegative[1], is(5));
    }
}
