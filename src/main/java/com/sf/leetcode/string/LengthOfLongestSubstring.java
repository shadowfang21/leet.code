package com.sf.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 * @author JohnDoe21
 *
 */
public interface LengthOfLongestSubstring {
	
    public int lengthOfLongestSubstring(String s);
	
    class LengthOfLongestSubstringForce implements LengthOfLongestSubstring {

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
//    		System.out.println(longestStr);
    		return result;
    	}

    }
    
    class LengthOfLongestSubstringSlidingWindow implements LengthOfLongestSubstring {

    	@Override
    	public int lengthOfLongestSubstring(String s) {
    		
    		int ans = 0;
    		
    		final Map<Character, Integer> map = new HashMap<Character, Integer>(s.length());
    		
    		int lastMatchIndex = 0;
    		for (int i = 0 ; i < s.length() ; i++) {
    			final char ch = s.charAt(i);
    			if (map.containsKey(ch)) {
    				lastMatchIndex = Math.max(map.get(ch), lastMatchIndex);
    			}
    			ans = Math.max(ans, i - lastMatchIndex);
    			map.put(ch, i);
    		}
    		return ans;
    	}

    }

}
