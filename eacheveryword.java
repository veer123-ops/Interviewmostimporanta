package global;

import java.util.Scanner;

public class eacheveryword {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// TODO Auto-generated method stub
	  Scanner sc= new Scanner(System.in);
	  String str=sc.nextLine(); 
	  String[]words=str.split(" ");
	  String reverstring=" ";
	  for(String w:words) {
		  String reverseword=" ";
		  for(int i=w.length()-1;i>=0;i--) {
			  reverseword=reverseword+w.charAt(i);
			  
		  }
		  
		  reverstring=reverstring+reverseword+" ";
	  }
	  
	  System.out.print(reverstring);
		}



		

	

	}

