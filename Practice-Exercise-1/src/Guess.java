import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number [0-100]");
		int number =input.nextInt();
		int guess;
		do{
			guess = input.nextInt();
			if(guess>number){
				System.out.println("Number guessed is more than original number");
			}
			else if(guess<number){
				System.out.println("Number guessed is less than original number");
			}
			else
				System.out.println("Number guessed is matches original number");
		}while(guess != number);
	}
	
}
