import java.util.Scanner;

public class nextround {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int place=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		int num=arr[place-1];
		for(int i=0;i<size;i++) {
			if(arr[i]<=num)
				count++;
		}
		System.out.println(count+1);
	}
}
