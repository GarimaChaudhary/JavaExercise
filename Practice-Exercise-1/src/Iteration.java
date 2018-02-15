import java.util.Scanner;

public class Iteration {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		String s="";
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				s = s+i+" ";
			}
		}
		System.out.println(s);
	}
	
}
