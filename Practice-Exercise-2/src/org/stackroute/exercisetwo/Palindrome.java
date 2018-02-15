package org.stackroute.exercisetwo;
public class Palindrome {
	
	public Boolean checkPalindrome(String str) {
		if(str.isEmpty()) {
			return null;
		}
		
		String reversed = reverseString(str);
		if(str.equals(reversed)) {
			return true;
		}
		else {
			return false;
		}		
	}
	
	public String reverseString(String str) {
		String reversed = "";
		char[] tempStr = str.toCharArray();
		for(int i = tempStr.length - 1; i >= 0 ; i--) {
			reversed = reversed + tempStr[i];
		}
		
		return reversed;
	}

}
