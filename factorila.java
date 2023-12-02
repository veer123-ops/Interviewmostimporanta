package global;

import java.util.Scanner;

public class factorila {
	
	public static  int factorial(int n) {
		int fact =1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			//System.out.print(fact);
		}
		System.out.print(fact);
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    factorial(n);
	}

}
