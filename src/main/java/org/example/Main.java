package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] res1 = TwoSumExample.handleTwoSum_v1(new int[]{2,5,5,11}, 10);
//        System.out.println(Arrays.toString(res1));
//
//        int[] res2 = TwoSumExample.handleTwoSum_v2(new int[]{2,5,5,11}, 10);
//        System.out.println(Arrays.toString(res2));

        boolean res1 = PalindromeNumExample.isPalindrome_v1(1001);
        System.out.println(res1);

        boolean res2 = PalindromeNumExample.isPalindrome_v2(1001);
        System.out.println(res2);

    }
}