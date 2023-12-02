package veer.com;

public class Arraysesortedyanotsoterd {
	
	
	public static boolean isorted(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr [] = {10,20,30,40,50,60,20};
   
   boolean isoted=isorted(arr);
   if(isoted) {
	   System.out.print("yes");
   }else {
	   System.out.print("no");
   }
	}

}
