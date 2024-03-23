package org.rouvsen.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome(121));;
    }
    public static boolean isPalindrome(int num) {
        if(num >=0 && num < 10) {
            return true;
        }
        if(num >= 10) {
            List<Integer> list = new ArrayList<>();
            while(num != 0) {
                list.add(num % 10);
                num = num / 10;
            }
            for(int i = 0; i < list.size() / 2; i++) {
                if(list.get(i) != list.get(list.size() - 1 - i))
                {return false;}
            }
            return true;
        }
        return false;
    }
}
