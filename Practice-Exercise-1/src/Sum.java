import java.util.InputMismatchException;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		String line=input.nextLine();
		String[] numbers = line.split("\\s+");
		
		for(int i=0;i<numbers.length;i++){
			int n=0;
			try{
				n = Integer.parseInt(numbers[i]);
				sum=sum+n;
			}
			catch(Exception e){
				System.out.println("Error");
				return;
			}
			
		}
		System.out.println(sum);
	}
}
