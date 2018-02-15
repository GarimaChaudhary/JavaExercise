import java.util.Scanner;

public class TypeofChar {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line =	input.next();
		if(line.length()>1){
			System.out.println("Error: Input not a char");
		}
		else{
			char c = line.charAt(0);
			if (c>='a' && c<='z'){
				System.out.println("Small case letter");
			}
			else if (c>='A' && c<='Z') {
				System.out.println("Capital letter");
			}
			else if(c>='0' && c<='9'){
				System.out.println("Digit");
			}
			else{
				System.out.println("Symbol");
			}
		}
	}
}
