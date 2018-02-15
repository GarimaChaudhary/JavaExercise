import java.util.Scanner;

public class ConsonantVowel {
	String s;
	Scanner input;
	public ConsonantVowel() {
		input = new Scanner(System.in);
		s = input.next();
	}
	
	void printOutput(){
		String opt = "";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if( (c>='a' && c<='z') || (c>='A' && c<='Z') ){
				switch(c){
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':opt = opt+"Vovel ";
							break;
					default:
						opt = opt +"Consonant ";
				}
			}
			else{
				System.out.println("Error");
				return;
			}
		}
		System.out.println(opt);
	}
	
	public static void main(String[] args) {
		new ConsonantVowel().printOutput();
	}
	
	
}
