package javaproject1;

import java.util.Arrays;
import java.util.EnumSet;

public class permutionsnber {
	
	public static void Permutions(int arr [] ,int start) {
		if(start==arr.length-1) {
			System.err.print(Arrays.toString(arr));
		}for (int i = start; i < arr.length; i++) {
				swapmethod(arr, start,i);
				Permutions(arr, start+1);
			}
		}
		
	
	
	static void swapmethod(int nums [] ,int i,int j) {
		int temp=nums[i];
	    nums[i]=nums[j];
	    nums[j]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {1,2,3};
   Permutions(arr, 0);
   
	}

}
