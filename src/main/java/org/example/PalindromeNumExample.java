package org.example;

public class PalindromeNumExample {

    public static boolean isPalindrome_v1(int x) {

        if (x < 0) return false;

        String str = String.valueOf(x);
        char[] charArray = str.toCharArray();

        int n = charArray.length;

        for (int i = 0; i < n / 2; i++) { //1001
            char temp = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = temp;
        }

        return str.equals(new String(charArray));
    }

    public static boolean isPalindrome_v2(int num) {
        if (num < 0)
            return false;

        int reversed = 0;
        int inp = num;

        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }

        return reversed == inp;
    }

}

