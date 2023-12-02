package javaproject1;

public class findthseconlargsetnumber {
	
	
	public static int Findsec(int arr[]) {
		
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
		
	}
	
	public static int Secondlargest(int arr []) {
		int min=Findsec(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==min) {
				arr[i]=Integer.MAX_VALUE;
			}
		}
		int min1=Findsec(arr);
		return min1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,5,6,9,1};
  
  System.out.print(Secondlargest(arr));
	}

}
