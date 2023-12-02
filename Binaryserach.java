package javaproject1;

public class Binaryserach {
	
	public static int Isbinaryse( int arr[]) {
		
		int start = 0;
		int end =arr.length-1;
		int target=50;
		while(start<=end) {
			int mid=(start+end)/2;
			if (arr[mid]<target) {
				start=mid+1;
			}else if (arr[mid]>target) {
				end=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,30,40,50,60};
  System.out.print(Isbinaryse(arr));
	}

}
