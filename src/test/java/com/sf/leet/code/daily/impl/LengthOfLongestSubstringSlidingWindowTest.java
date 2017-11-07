package com.sf.leet.code.daily.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LengthOfLongestSubstringSlidingWindowTest extends LengthOfLongestSubstringTest {

	public LengthOfLongestSubstringSlidingWindowTest(String input, int expectedResult) {
		super(input, expectedResult);
	}

	@Before
	public void setUp() {
		test = new LengthOfLongestSubstringSlidingWindow();
	}

}
