package com.sf.leet.code.daily.impl;

import java.util.Arrays;

import com.sf.leet.code.daily.ContainsDuplicate;

public class ContainsDuplicateForce implements ContainsDuplicate {

	@Override
	public boolean containsDuplicate(int[] nums) {
		
		Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
		
	    //slower when set add
//		Set<Integer> set = new HashSet<Integer>();
//		
//		for (int i : nums) {
//			if (set.contains(i)) {
//				return true;
//			}
//			set.add(i);
//		}
//		
//		return false;
	}

}
