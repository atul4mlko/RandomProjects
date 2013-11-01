package com.arrays;

public class Palindrome {

	public boolean isPalindrome(String arr) {
		int i=0, k = arr.length()-1;
		for (i=0; i<arr.length()/2; i++) {
			if (arr.charAt(i) != (arr.charAt(k--)))
				return false;
		}
		return true;
	}
	
	public boolean isPalindrome(char[] arr) {
		int i=0, k = arr.length-1;
		for (i=0; i<arr.length/2; i++) {
			if (arr[i] != arr[k--])
				return false;
		}
		return true;
	}
	
	public boolean isPalindrome(int[] arr) {
		int i=0, k = arr.length-1;
		for (i=0; i<arr.length/2; i++) {
			if (arr[i] != arr[k--])
				return false;
		}
		return true;
	}
	
	public boolean isPalindrome(int num) {
		int reverse = 0, tmp = num;
		while (tmp != 0) {
			reverse = reverse*10 + tmp%10;
			tmp /= 10;
		}
		if (num == reverse)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Palindrome palin = new Palindrome();
		int[] intArray = {1,2,3,4,3,2,1};
		System.out.println("Is given integer array a palindrome ? " + palin.isPalindrome(intArray));
		char[] charArray = {'a','b','b','a'};
		System.out.println("Is given char array a palindrome ? " + palin.isPalindrome(charArray));
		int number = 6474;
		System.out.println("Is " + number + " a palindrome ? " + palin.isPalindrome(number));
		String string = "malayalam";
		System.out.println("Is " + string + " a palindrome ? " + palin.isPalindrome(string));
	}
}
