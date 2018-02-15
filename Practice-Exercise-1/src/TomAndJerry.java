import java.util.Scanner;

public class TomAndJerry {
	int n;
	Scanner input; 
	public TomAndJerry(){
		input = new Scanner(System.in);
		n = input.nextInt();
	}
	void printOutput(){
		if(n>20 && n<30){
			if(n%2==0){
				System.out.println("Tom");
			}
			else{
				System.out.println("Jerry");
			}
		}
	}
	public static void main(String[] args) {
		new TomAndJerry().printOutput();
	}
}
