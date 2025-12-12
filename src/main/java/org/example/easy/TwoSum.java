package org.example.easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int seacherdNum = target - nums[i];
            if (numsMap.containsKey(seacherdNum)) {
                return new int[]{numsMap.get(seacherdNum), i};
            }
            numsMap.put(nums[i],i );
        }
        return new int[]{-1, -1};
    }
}
