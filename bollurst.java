package javaproject1;

public class bollurst {
	
	static void isbullosrt(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr [] = {10,20,30,40,50,69,23,36,1,2,3};
     
     for(int i=0;i<arr.length-1;i++) {
    	 for(int j=0;j<arr.length-1;j++) {
    		 if(arr[j]>arr[j+1]) {
    			 int temp=arr[j];
    			 arr[j]=arr[j+1];
    			 arr[j+1]=temp;
    		 }
    	 }
    	 //isbullosrt(arr);
     }
     isbullosrt(arr);
	}

}
