package javaproject1;

public class Longcusitivenumber {
	
	public static int Longcustive(int nums [] ,int target) {
		int count=0;
		int max=0;
		for(int val : nums) {
			if (val==target) {
				count++;
				max=Math.max(max,count);
			}else {
				count=0;
			}
		} 
		return target;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {1, 2, 2, 3, 3, 3, 4, 4, 4,4 ,4,4, 5, 5};
		    int data =4;
		    System.out.print(Longcustive(arr, data));
	}

}
