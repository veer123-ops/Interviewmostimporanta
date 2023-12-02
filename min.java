package javaproject1;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {10,20,30,50};
		  int min=arr[0];
		  for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		  
		  System.out.print(min);
			}

	}


