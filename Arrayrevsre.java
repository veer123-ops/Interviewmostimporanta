package veer.com;

import java.util.Arrays;

public class Arrayrevsre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr []= {10,0,20,52,69,36};
    int i=0;
    int j= arr.length-1;
    int temp=0;
     while(i<j) {
    	temp =arr[i];
    	arr[i]=arr[j];
    	arr[j]=temp;
    	i++;
    	j--;
     }
     System.out.print(Arrays.toString(arr));
    	 
	
	}}