package veer.com;


public class firstlastflasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = {10,20,30,30,40,45,45,69,69};
		 int fisrt=-1;
		 int  last =-1;
		 
		 int data=45; 
		 
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i] == data && fisrt==-1  ) {
				 fisrt=i;
			 }if(arr[i]== data && fisrt!=-1) {
				 last=i;
			 }
				 
		 }
		 
		 System.out.print(fisrt + " " + last);
				 
	}}