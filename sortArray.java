package global;

import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,50,9,1,62,3,69,5,0};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) { 
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					 
				}
			}
		}
		//Arrays.parallelSort(arr);
		
		
		System.out.print(Arrays.toString(arr));

	}

}
