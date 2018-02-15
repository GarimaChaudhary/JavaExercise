import java.util.Scanner;

public class Lastn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String line =	input.next();
		String opt = "";
		int n = input.nextInt();
		opt = opt+line;
		String substr = line.substring(line.length()-n, line.length());
		
		for(int i=0;i<n;i++){
			opt = opt+substr;
		}
		System.out.println(opt);
	}
}
