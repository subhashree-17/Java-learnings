package ProblemsNew;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target + nums[i];
            if (numIndexMap.containsKey(complement)) {
                return new int[]{numIndexMap.get(complement), i};
            }
            numIndexMap.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = -5;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Output 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 10;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Output 2: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 0;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Output 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}

