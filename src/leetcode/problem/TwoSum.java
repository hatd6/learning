package leetcode.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target. You may assume that each input
 * would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order. Constraints: 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9 -10^9 <= target <= 10^9 Can you come up with an
 * algorithm that is less than O(n2) time complexity?
 *
 */
public class TwoSum {
    public static void main(String[] args) {
	int[] nums = { 2, 7, 11, 15, 1 };
	int target = 18;
	twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> numToIndex = new HashMap<>();
	int fnum;

	for (int i = 0; i < nums.length; i++) {
	    System.out.println("index = " + i + " === value = " + nums[i]);
	    fnum = target - nums[i];
	    if (numToIndex.containsKey(fnum)) {
		System.out.println("Found it");
		return new int[] { numToIndex.get(fnum), i };
	    }
	    numToIndex.put(nums[i], i);
	}
	return new int[] {};
    }
}
