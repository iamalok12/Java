import java.util.Scanner;

public class team {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b[]=new int[n];
		int a[][]=new int[n][3];
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=s.nextInt();
			}
		}
		int sum=0,res=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				sum=sum+a[i][j];
			}
			if(sum>1)
				b[i]=1;
			else
				b[i]=0;
			sum=0;
		}
		for(int i=0;i<n;i++)
			res=res+b[i];
		System.out.println(res);
	}
}
