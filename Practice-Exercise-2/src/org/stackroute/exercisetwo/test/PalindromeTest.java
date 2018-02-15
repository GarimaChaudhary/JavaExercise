package org.stackroute.exercisetwo.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stackroute.exercisetwo.Palindrome;

public class PalindromeTest {
	
	Palindrome palindrome;
	@Before
	public void setUp() {
		palindrome = new Palindrome();
	}

	@After
	public void tearDown() {
		palindrome = null;
	}

	@Test
	public void methodShouldReturnTrueForPalindromes() {
		String str = "12344321";
		boolean actualRes = palindrome.checkPalindrome(str);
		assertTrue("Input is a Palindrome", actualRes);
	}
	
	@Test
	public void methodShouldReturnFalseForNonPalindromes() {
		String str = "garima";
		boolean actualRes = palindrome.checkPalindrome(str);
		assertFalse("Input is Not a Palindrome", actualRes);
	}

}
