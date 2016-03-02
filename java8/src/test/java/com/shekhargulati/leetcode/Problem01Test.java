package com.shekhargulati.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Problem01Test {

    @Test
    public void shouldFindTwoNumberWhoseSumIsEqualToTarget() throws Exception {
        int[] pairs = Problem01.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(pairs, new int[]{2, 7}));
    }

    @Test
    public void shouldFindTwoNumberWhoseSumIsEqualToTarget2() throws Exception {
        int[] pairs = Problem01.twoSum(new int[]{10, 17, 11, 30}, 21);
        assertTrue(Arrays.equals(pairs, new int[]{10, 11}));
    }


    @Test
    public void shouldFindTwoNumberWhoseSumIsEqualToTarget_index() throws Exception {
        int[] pairs = Problem01.twoSumIndexes(new int[]{2, 7, 11, 15}, 9);
        assertTrue(Arrays.equals(pairs, new int[]{0, 1}));
    }

    @Test
    public void shouldFindTwoNumberWhoseSumIsEqualToTarget2_index() throws Exception {
        int[] pairs = Problem01.twoSumIndexes(new int[]{10, 17, 11, 30}, 21);
        assertTrue(Arrays.equals(pairs, new int[]{0, 2}));
    }

    @Test
    public void shouldWorkOnARandomArray() throws Exception {
        int[] numbers = new Random().ints(100000, 1, 100000).toArray();
        long start = System.currentTimeMillis();
        int[] pairs = Problem01.twoSum(numbers, 100);
        long end = System.currentTimeMillis();
        System.out.println(String.format("Total time taken %d sec(s)", (end - start) / 1000));
        System.out.println(Arrays.toString(pairs));
        assertThat(pairs.length, equalTo(2));

    }
}