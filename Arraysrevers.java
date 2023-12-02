package javaproject1;

public class Arraysrevers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,20,30,40,50};
  int i=0;
  int j=arr.length-1;
  int temp;
  while(i<j) {
	  temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	  i++;
	  j--;
  }
  
  System.out.print(arr[i]);
	}

}
