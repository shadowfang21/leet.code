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
public class TwoSumForce implements TwoSum {
	
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
