package global;

import java.util.Scanner;

public class CounttheSring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static void main(String[] args) {
			// TODO Auto-generated method stub
	 Scanner sc= new Scanner(System.in);
	 
	  String str=sc.nextLine();
	  int count=0; 
	   for(int i=0;i<str.length();i++) {
		   if(str.charAt(i)!=' ') {
			   count++;
		   } 
	   } 
	   System.out.println(count);
		
	}

}
