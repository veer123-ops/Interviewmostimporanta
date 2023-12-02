package global;

import java.util.Scanner;

public class reversenumber {
	
	public static int resverse(int n) {
		
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.print(rev);
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		resverse(n);
 
	}

}
