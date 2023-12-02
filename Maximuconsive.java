 package veer.com;

public class Maximuconsive {

	
	public static int maxmuumconstive(int [] nums) {
		int count=0;
		int max=0;
		
		for(int val:nums) {
			if(val==1) {
				count++;
				max=Math.max(max, count);
			}else {
				count=0;
			}
		}
		return max;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr []= {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
		  System.out.print(maxmuumconstive(arr));
	}

}
