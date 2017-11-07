package com.sf.leet.code.daily.impl;

import java.util.HashMap;
import java.util.Map;

import com.sf.leet.code.daily.LengthOfLongestSubstring;

public class LengthOfLongestSubstringSlidingWindow implements LengthOfLongestSubstring {

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
