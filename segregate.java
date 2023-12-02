package veer.com;


	// Java code to segregate 0 and 1 
	
		//Method for segregation 0 and 1 given input array 
		//*/
		// Java code to segregate 0 and 1 
		import java.io.*; 
		import java.util.*; 

	public	class segregate { 
			/** 
			Method for segregation 0 and 1 given input array 
			*/
			static void segregate0and1(int arr[]) 
			{ 
				int a = 0; 
				int b = arr.length - 1; 

				while (a < b) { 
					if (arr[a] == 1) { 
						if (arr[b] != 1) { 
							// swap 
							arr[b] = arr[b] + arr[a]; 
							arr[a] = arr[b] - arr[a]; 
							arr[b] = arr[b] - arr[a]; 
						} 
						b--; 
					} 
					else { 
						a++; 
					} 
				} 
			} 
 
			// Driver program 
			public static void main(String[] args) 
			{ 

				int[] array = { 0, 1, 0, 1, 1, 1 }; 

				segregate0and1(array); 

				for (int a : array) { 
					System.out.print(a + " "); 
				} 
			} 
		}
