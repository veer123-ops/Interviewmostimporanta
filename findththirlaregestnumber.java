package javaproject1;


	
	// Java implementation 
	import java.util.Arrays; 
	public class findththirlaregestnumber {



		public static int thirdLargest(int[] arr) 
		{ 
			int arr_size = arr.length; 
			// if array size is less than 3, 
			// then it will give invalid input 
			if (arr_size < 3) { 
				System.out.println("Invalid Input"); 
				return 0; 
			} 
			else { 
				// here we are sorting the array 
				// return 3rd largest element 
				Arrays.sort(arr); 
				return arr[arr_size - 3]; 
			} 
		} 

		/* Driver program to test above function */
		public static void main(String[] args) 
		{ 

			// Input taken 
			int[] arr = { 12, 13, 1, 10, 34, 16 }; 
			System.out.println(thirdLargest(arr)); 
		} 
	}
