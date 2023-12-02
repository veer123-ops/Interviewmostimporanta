package javaproject1;

public class Factrialreruion {
	
	static  int fib(int n) {
		
		if(n==1) {
			return 1;
		}
		return n * fib(n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     for (int i = 1; i <=n; i++) {
		System.out.println(fib(i));
	}
     System.out.print(fib(n));
     
	}

}
