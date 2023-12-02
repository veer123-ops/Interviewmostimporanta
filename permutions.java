package veer.com;



import java.security.PublicKey;
import java.util.Arrays;

public class permutions {
	

	public  static void Permutions(int [] nums,int start) {
		if(start==nums.length-1) {
			System.out.print(Arrays.toString(nums));
			return;
		}
		for(int i=start;i<nums.length;i++) {
			swap(nums, start, i);
			Permutions(nums, start+1);
		}
		
	}
	
	public static void swap(int [] nums,int i,int j) {
		
		int temp=nums[i];
		nums[i]=nums[j];
		
		nums[j]=temp;
	}
	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3};
		Permutions(numbers, 0);
	
	
	}

}
