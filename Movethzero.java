package veer.com;

import java.util.Arrays;

public class Movethzero {
	
	
	public static  int [] movethsightsisd(int arr  []) {
		
		if(arr.length==1) {
			return arr;
		}
		
		int  [] arr2=new int[arr.length];
		
		int count =0;
		for(int val :arr) {
			if(val!=0) {
				arr2[count]=val;
				count++;
			}
		} 
		return arr2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr1 [] = {1, 0, 2, 0, 3, 0, 0,0, 0 ,10,11,5,0,5,0,10};
  System.out.println(Arrays.toString(movethsightsisd(arr1)));
	}

}
