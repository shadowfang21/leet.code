package com.sf.leetcode.number;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * @author JohnDoe21
 *
 */
public interface ReverseInteger {
	
	int reverse(int x);
	
	 class ReverseIntegerForce implements ReverseInteger {
			
			//2147483647
			private static int MAX = (Integer.MAX_VALUE) / 10;
			
			//-2147483648
			private static int MIN = (Integer.MIN_VALUE) / 10;
			
			@Override
			public int reverse(int x) {
				int result = 0;
				int temp = x;
				while (temp != 0) {
					if (result > MAX || result < MIN) {
						return 0;
					} else {
						result = result * 10 + temp % 10;
					}
					temp /= 10;
				}
				return result;
			}

		}

}
