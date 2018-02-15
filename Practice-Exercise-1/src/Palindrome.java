import java.util.Scanner;

public class Palindrome {
	String s;
	boolean isNumeric(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				return false;
		}
		return true;
	}
	public Palindrome(){
		Scanner input = new Scanner(System.in);
		s = input.next();
	}
	
	boolean isPalindrome(){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!= s.charAt(j)){
				return false;
			}
			i++;j--;
		}
		return true;
	}
	
	boolean sumEvenGT(int n){
		int sum=0;
		for(int i=0;i<s.length();i++){
			int c = s.charAt(i)-'0';
			if(c%2==0){
				sum=sum+c;
			}
		}
		if(sum>n)
			return true;
		else 
			return false;
	}
	void printOutput(){
		if(isPalindrome()){
			if(sumEvenGT(25)){
				System.out.println(s+" is a palindrome and sum of even numbers is greater than 25");
			}
			else{
				System.out.println(s+" is a palindrome and sum of even numbers is less than 25");
			}
		}
		else{
			System.out.println(s+" is not a palindrome");
		}
	}
	public static void main(String args[]){
		new Palindrome().printOutput();
	}
		
}
