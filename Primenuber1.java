package javaproject1;

public class Primenuber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=10;
   for (int i = 1; i <=n; i++) {
	   int temp=0;
	   for (int j = 2; j<=i-1; j++) {
		if (i%j==0) { 
			temp=temp+1;
		}
		}
	   if(temp==0) {
		
		//System.out.print(i + " ");
	}
		System.out.print(i + " ");
}
	}

}
