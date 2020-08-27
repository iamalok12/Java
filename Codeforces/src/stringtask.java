import java.util.Scanner;
import java.io.*;

public class stringtask {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input=s.nextLine();
		input=input.toLowerCase();
		char ch='.';
		char inputchar[]=new char[input.length()];
		for(int i=0;i<input.length();i++) {
			inputchar[i]=input.charAt(i);
		}
		int j=0;
		char output[]=new char[input.length()];
		for(int i=0;i<inputchar.length;i++) {
			if(inputchar[i]=='a')
				continue;
			else if(inputchar[i]=='e')
				continue;
			else if(inputchar[i]=='i')
				continue;
			else if(inputchar[i]=='o')
				continue;
			else if(inputchar[i]=='u')
				continue;
			else if(inputchar[i]=='y')
				continue;	
			else {
				output[j]= inputchar[i];
				j++;
				
			}	
		}//for
		for(int i=0;i<output.length;i++) {
			if(output[i]!='\u0000') {
				System.out.print('.');
				System.out.print(output[i]);
			}
		
		}
	}
}
