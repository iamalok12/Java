import java.util.Scanner;

//50A
public class domino {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int v=s.nextInt();
		int x;
		int y;
		if(h>v) {
			x=h;
			y=v;
		}
		else {
			y=h;
			x=v;
		}
		int count1=0;	
        for(int i=y;i>=0;i=i-2) {
        	count1++;
        }
        
        count1=count1-1;
        int res=count1*x;
        int count2=0;
        int result=0;
        if((count1*2-y)==0)
        	System.out.println(res);
        else {
        	for(int j=x;j>=0;j=j-2) {
        		count2++;
        	}
        	result=res+count2-1;	
            System.out.println(result);
        }

	}

}
