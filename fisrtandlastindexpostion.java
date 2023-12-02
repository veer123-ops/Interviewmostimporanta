package javaproject1;

public class fisrtandlastindexpostion {

	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		int arr1 [] = {10,20,30,30,40,45,45,69,69};
		 int fisrt=-1;
		 int  last =-1;
		 
		 int data1=45; 
		 
		 
		 for(int i=0;i<arr1.length;i++) {
			 if(arr1[i] == data1 && fisrt==-1  ) {
				 fisrt=i;
			 }if(arr1[i]== data1 && fisrt!=-1) {
				 last=i;
			 }
				 
		 }
		 
		 System.out.print(fisrt + " " + last);
				 
	}}