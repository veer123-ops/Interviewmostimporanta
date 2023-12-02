package global;

import java.util.Scanner;

public class reversesrting {

public static void String(String n) {
	
	for(int i=n.length()-1;i>=0;i--) {
		System.out.print(n.charAt(i));
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     String n=sc.nextLine();
     
     String(n);
	}

}
 