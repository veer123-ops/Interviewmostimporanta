package global;

import java.util.Scanner;

public class evenoddnumberadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int value[]=oddEvenall(n);
    
  
  System.out.println(value[0]);
  System.out.println(value[1]); 
  
	}
	

	private static int[] oddEvenall(int n) {
		// TODO Auto-generated method stub
		
		int sum[]=new int[2];
		while(n!=0) {
			int num=n%10;
			if(num%2!=0) 
				sum[1]=sum[1]+num;  
				else
				sum[0]=sum[0]+num;
			
				n=n/10;
			
		}
		return sum;
	}}
  
	
