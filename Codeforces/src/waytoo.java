import java.util.Scanner;

public class waytoo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		String a[]=new String[n+1];         // last index+1 because last elemnt in string is "0"
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextLine();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<=10)
				System.out.printf("%s\n",a[i]);
			else {
				int num=a[i].length()-2;
				char x=a[i].charAt(0);
				char y=a[i].charAt(a[i].length()-1);
				System.out.printf("%c%d%c\n",x,num,y);
				
			}
		}
	}
}
