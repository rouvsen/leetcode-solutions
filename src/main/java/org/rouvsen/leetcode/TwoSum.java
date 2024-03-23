package org.rouvsen.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,5,12,19}, 17);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currVal = target - nums[i];
            if (map.containsKey(currVal)){
                return new int[]{nums[map.get(currVal)], nums[i]};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not found any matching!");
    }


}
