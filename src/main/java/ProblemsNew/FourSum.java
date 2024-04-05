package Problems;

import java.util.*;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;


                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FourSum solution = new FourSum();

        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> result1 = solution.fourSum(nums1, target1);
        System.out.println("Output 1: " + result1);

        int[] nums2 = {2, 2, 2, 2, 2};
        int target2 = 8;
        List<List<Integer>> result2 = solution.fourSum(nums2, target2);
        System.out.println("Output 2: " + result2);
    }
}
