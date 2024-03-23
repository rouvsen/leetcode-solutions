package org.rouvsen.hackerrank;

import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}"));
    }
    // {[()]} - YES
    // {[(])} - NO
    // {{[[(())]]}} - YES
    public static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') {
//                stack.push(')');
//            } else if (str.charAt(i) == '[') {
//                stack.push(']');
//            } else if (str.charAt(i) == '{') {
//                stack.push('}');
//            } else if (stack.isEmpty() || str.charAt(i) != stack.pop()) {
//                return "NO";
//            }
//        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
