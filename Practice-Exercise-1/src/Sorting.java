import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
	static boolean isNumeric(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> digits = new ArrayList<Integer>();
		String line  = input.nextLine();
		if(!isNumeric(line)){
			System.out.println("Erro: Input not a number");
		}
		else{
			for(int i=0;i<line.length();i++){
				digits.add(line.charAt(i)-'0');
			}
			Collections.sort(digits);
			Collections.reverse(digits);
			String opt = "";
			int sum=0;
			for(Integer i:digits){
				opt = opt+i;
				if(i%2==0)
					sum=sum+i;
			}
			System.out.println( "Sorted number in non-increasing order : "+opt );
			System.out.println("Sum of even numbers : "+sum);
			if(sum>15){
				System.out.println("True");
			}
			else
				System.out.println("False");
		}
	}
}
