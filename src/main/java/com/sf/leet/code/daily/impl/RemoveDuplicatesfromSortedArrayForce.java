package com.sf.leet.code.daily.impl;

import com.sf.leet.code.daily.RemoveDuplicatesfromSortedArray;

public class RemoveDuplicatesfromSortedArrayForce implements RemoveDuplicatesfromSortedArray {

	@Override
	public int removeDuplicates(int[] nums) {
		
		if (nums.length == 0) {
			return 0;
		}
		int idx = 0;
		for (int i = 1 ; i < nums.length ; i++) {
			if (nums[idx] != nums[i]) {
				if (i > idx + 1) {
					//swap
					nums[idx+1] = nums[i];
				}
				idx++;
			} 
		}
		return idx+1;
	}

}
