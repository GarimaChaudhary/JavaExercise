import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String line =s.nextLine();
		char[] chars = line.toCharArray();
		String opt = "";
		for(int i=chars.length-1;i>=0;i--){
			opt = opt+chars[i];
		}
		System.out.println(opt);
	}
}
