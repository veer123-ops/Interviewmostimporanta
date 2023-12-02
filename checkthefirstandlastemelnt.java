package veer.com;

public class checkthefirstandlastemelnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr [] = {10,20,30,40,50,60,60};
     int first=-1;
     int last=-1;
     
     int data=60;
     for(int i=0;i<arr.length;i++) {
    	 if (arr[i] == data && first==-1) {
			first=i;
		}if (arr[i] == data && first!=-1) {
			last=i; 
		}
     }
     
     System.out.print( first + "  " + last);
	}

}
