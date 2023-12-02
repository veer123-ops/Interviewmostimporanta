package javaproject1;

public class Arrayssortadnotsort {
	
	public static boolean isboolean(int arr [] ){
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int  arr [] = {10,20,1,30,40,50};
     boolean isuhn=isboolean(arr);
     if (isuhn) {
		System.out.print("yes");
	}else {
		System.out.print("no");
	}
	}

}
