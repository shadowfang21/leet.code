package com.sf.leet.code.daily.impl;

import com.sf.leet.code.daily.LengthOfLongestSubstring;

public class LengthOfLongestSubstringForce implements LengthOfLongestSubstring {

	@Override
	public int lengthOfLongestSubstring(String s) {
		
		final StringBuilder sb = new StringBuilder(s.length());
		
		int result = 0;
		String longestStr = null;
		
		for (int i = 0 ; i < s.length() ; i++) {
			final char ch = s.charAt(i);
			
			final int indexOfChar = sb.indexOf(String.valueOf(ch)); 
			if (indexOfChar >= 0) { //found str
				sb.delete(0, indexOfChar + 1);
				sb.append(ch);
			} else {
				sb.append(ch);
				if (sb.length() > result) {
					result = sb.length();
					longestStr = sb.toString();
				}
			}
		}
//		System.out.println(longestStr);
		return result;
	}

}
