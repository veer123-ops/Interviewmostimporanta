package global;

import java.util.Arrays;

public class Arraysstringreversej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,2,6,8,9}; 
		  
		  int i=0;
		  int j=a.length-1;
		 int temp; 
		  
		  while(i<j) {
			  temp=a[i]; 
			  a[i]=a[j];
			  a[j]=temp;
			  i++;
			  j--;
		  }
		  System.out.println(Arrays.toString(a));
			}

		
}
 