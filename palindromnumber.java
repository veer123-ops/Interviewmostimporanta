package global;

import java.util.Scanner;

public class palindromnumber {

	public static int palindrom(int n) {
		
		int rev=0;
		int org=n;
		
		while(n>0) { 
			rev=rev*10+n%10;
			n=n/10;
			
			if(org==rev) {
				System.out.print(org+"palidrom  umber");
			}
				///return org;
				else { 
					System.out.print(org+"palinfdrom  not numbrr");
	
		}	
		}
	
		//return org;
		return org;
			
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		// int n;
		palindrom(n);
	}

}
