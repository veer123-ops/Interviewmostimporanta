package javaproject1;

public class Finsecondlargestnumber {

public static int Findsec(int arr[]) {
		
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
	
	public static int Secondlargest(int arr []) {
		int max=Findsec(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int max1=Findsec(arr);
		return max1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,5,6,9,1};
  
  System.out.print(Secondlargest(arr));
	}

}
