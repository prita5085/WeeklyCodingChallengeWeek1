package com.revature;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LookAndSay {
	
	
	public static void main(String[] args) {
		
		System.out.println(lookAndSay(BigInteger.valueOf(3132)));                                   //111222
		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213200012171979"))));     //23002799999999
		System.out.println(lookAndSay(BigInteger.valueOf(54544666)));                               //44444444446666666666
		System.out.println(lookAndSay(BigInteger.valueOf(95)));                                     //555555555
		System.out.println(lookAndSay(BigInteger.valueOf(Long.parseLong("1213141516171819"))));     //23456789
		System.out.println(lookAndSay(BigInteger.valueOf(120520)));                                 //200
		System.out.println(lookAndSay(BigInteger.valueOf(231)));                                    //-1
	}

	
	private static BigInteger lookAndSay(BigInteger nums) {
		BigInteger b = null;
		String numbers = String.valueOf(nums);
		int digits = numbers.length();
		
		String result = "";
	
		if(digits % 2 == 0) {
			for(int i=0; i<numbers.length()-1; i=i+2) {
				int num1 = Character.getNumericValue(numbers.charAt(i));
				for(int j = 0; j < num1; j++) {
					result = result + numbers.charAt(i + 1);
				}
			}
		}
		else {
			result = "-1";
		}
		return new BigInteger(result);
	}
}
