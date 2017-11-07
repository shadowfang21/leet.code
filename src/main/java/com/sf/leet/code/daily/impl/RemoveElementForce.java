package com.sf.leet.code.daily.impl;

import com.sf.leet.code.daily.RemoveElement;

public class RemoveElementForce implements RemoveElement {

	@Override
	public int removeElement(int[] nums, int val) {
		int i = 0;
	    int n = nums.length;
	    while (i < n) {
	        if (nums[i] == val) {
	            nums[i] = nums[n - 1];
	            // reduce array size by one
	            n--;
	        } else {
	            i++;
	        }
	    }
	    return n;
	}

}
