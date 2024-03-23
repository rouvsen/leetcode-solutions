package org.rouvsen.hackerrank;

import java.util.*;

public class EqualityInArray {
    public static void main(String[] args) {
        System.out.println(foo(List.of(1, 3, 3, 2))); //4
    }
    // 1 n 10 <=0
    // 1 <= arr[i] <= 100 <=
    // return int, get List<Integer>

    public static int foo(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : list) {
            if (!map.containsKey(el)) {
                map.put(el, 1);
            } else {
                map.put(el, map.get(el) + 1);
            }
        }
        int max = 0;
        for (Integer el : map.keySet()) {
            if (map.get(el) > max) {
                max = map.get(el);
            }
        }
        return list.size() - max;
    }
}


