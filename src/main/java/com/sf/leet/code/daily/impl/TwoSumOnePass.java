package com.sf.leet.code.daily.impl;

import java.util.HashMap;
import java.util.Map;

import com.sf.leet.code.daily.TwoSum;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
 * @author JohnDoe21
 *
 */
public class TwoSumOnePass implements TwoSum {
	
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
