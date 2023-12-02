package javaproject1;

import java.util.Arrays;

public class Productself {
	
	public static void Producself(int arr [] ,int res []) {
		for (int i = 0; i < arr.length; i++) {
			int sum=1;
			for (int j = 0; j < arr.length; j++) {
				if(i==j) {
					continue;
				}
				sum=sum*arr[j];
			}
			
		res[i]=sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,30};
  int res[] =new int [arr.length];
  Producself(arr, res);
  System.out.print(Arrays.toString(res));
		  
	}

}
