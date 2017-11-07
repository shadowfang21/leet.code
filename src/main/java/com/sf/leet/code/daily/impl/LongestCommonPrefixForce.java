package com.sf.leet.code.daily.impl;

import com.sf.leet.code.daily.LongestCommonPrefix;

public class LongestCommonPrefixForce implements LongestCommonPrefix {

	@Override
	public String longestCommonPrefix(String[] strs) {
		
		String temp = "";
		if (strs.length > 0) {
			temp = strs[0];
			for (int i = 0 ; i < strs.length ; i++) {
				temp = this.longestCommonPrefix(temp, strs[i]);
			}
		}
		return temp;
	}
	
	private String longestCommonPrefix(final String s1, final String s2) {
		
		int minLength = Math.min(s1.length(), s2.length());
		
		for (int i = 0 ; i < minLength ; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return new String(s1.substring(0, i));
			}
		}
		return s1.length() > s2.length() ? s2 : s1;
	}
	
}
