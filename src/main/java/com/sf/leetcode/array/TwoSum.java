package com.sf.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
 * @author JohnDoe21
 *
 */
public interface TwoSum {
	
	int[] twoSum(int[] nums, int target);
	
	class TwoSumForce implements TwoSum {
		
	    public int[] twoSum(int[] nums, int target) {
	    	final int[] result = new int[2];
	    	
	    	A:for (int i = 0 ; i < nums.length ; i++) {
	    		final int expected = target - nums[i];
	    		for (int j = 0 ; j < nums.length ; j++) {
	    			if (j != i && nums[j] == expected) {
	    				result[0] = i;
	    				result[1] = j;
	    				break A;
	    			}
	    		}
	    	}
	    	return result;
	    }
	}
	
	class TwoSumOnePass implements TwoSum {
		
	    public int[] twoSum(int[] nums, int target) {
	    	final int[] result = new int[2];
	    	
	    	final Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
	    	
	    	for (int i = 0 ; i < nums.length ; i++) {
	    		final int expected = target - nums[i];
	    		if (map.containsKey(nums[i])) {
	    			result[0] = map.get(nums[i]);
	    			result[1] = i;
	    			break;
	    		}
	    		map.put(expected, i);
	    	}
	    	return result;
	    }
	}
}
