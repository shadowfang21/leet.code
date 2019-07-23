package com.sf.leetcode.string;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * @author JohnDoe21
 *
 */
public interface LongestCommonPrefix {
	String longestCommonPrefix(String[] strs);
	
	class LongestCommonPrefixForce implements LongestCommonPrefix {

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

}
