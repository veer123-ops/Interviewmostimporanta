package javaproject1;

public class ArrayRoted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,20,30,50,59};
   int n=8;
   for (int i = 0; i <n; i++) {
	int first=arr[0],j;
	
	for ( j = 0; j < arr.length-1; j++) {
		arr[j]=arr[j+1];
	}
	arr[j]=first;
}
   
   for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]  + " ");
}
	}

}
