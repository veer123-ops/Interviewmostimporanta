package javaproject1;

public class longdcustie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,2,4,3};
   
   int count=0;
   int max=0;
   for (int i = 0; i < arr.length-1; i++) {
	if(arr[i]+1==arr[i+1]) {
		count++;
		 
	}else {
		count=0;
	}
	max=Math.max(max, count);
}
   
   System.out.print(max);
	}

}
