package global;

import java.util.Scanner;

public class primebyb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int temp=0;
		for(int i=1;i<=n;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
				
			if(i%j==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println(i+"pm");
		}else {
			System.out.println(i+"pm is not");
		}
	}



	}

}
