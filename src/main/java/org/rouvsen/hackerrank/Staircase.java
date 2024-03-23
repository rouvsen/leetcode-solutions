package org.rouvsen.hackerrank;

public class Staircase {
    public static void main(String[] args) {
        stairCase(10);
    }

    public static void stairCase(int num) {
//           *
//          **
//         ***
//        ****
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
