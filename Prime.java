package javaproject1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=5;
  int temp=0;
  for (int i = 2; i <=n-1; i++) {
	if (n%i==0) {
		temp=temp+1;
	}if(temp==0) {
		//System.out.print(n + " prime is number");
	}
}
  
  System.out.print(n + " prime is number");
	}

}
