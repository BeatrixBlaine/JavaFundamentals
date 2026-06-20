package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        int[] result = twoSum(nums, 7);

        System.out.println("[" + result[0] + ", " + result[1] + "]");

        int[] result1 = anotherTwoSum(nums, 3);
        PrintArray.printArray(result1);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};

    }

    public static int[] anotherTwoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
    
    
}
