package javaproject1;

public class fibnoseries {
	
	static int fib(int n) {
		if(n==1|| n==0) {
			return n;
		}
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=9; 
     for (int i = 1; i<=n ;i++) {
		System.out.println(fib(i));
	}
     System.out.print(fib(n));
	}

}
