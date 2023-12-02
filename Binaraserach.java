package veer.com;

import javax.xml.crypto.Data;

public class Binaraserach {
	
	static  int binary(int arr []) {
		
		int start=0;
		int end=arr.length-1;
		int Data =70;
		
		while(start<=end) {
			int mid =(start+end)/2;
			if(arr[mid]<Data) {
				start=mid+1;
			}else if(arr[mid]>Data) {
				end=mid-1;
				
			}else {
				return mid;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [ ]= {10,20,40,50,60};
   
   System.out.print(binary(arr));
	}

}
