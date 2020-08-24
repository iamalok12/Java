import java.util.Scanner;
import java.lang.Math;

public class Theatre {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		double n=s.nextInt();
		double m=s.nextInt();
		double a=s.nextInt();
		long num= (long)(Math.ceil(n/a)*Math.ceil(m/a));
		System.out.println(num);
		
	}
}
