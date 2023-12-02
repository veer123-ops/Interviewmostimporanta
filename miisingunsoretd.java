package javaproject1;

public class miisingunsoretd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {0,5,3,2,1};
   int n=arr.length;
   int total=n*(n+1)/2;
   int sum=0;
   for (int i = 0; i < arr.length; i++) {
	sum+=arr[i];
}
   
   System.out.print(total-sum);
	}

}
