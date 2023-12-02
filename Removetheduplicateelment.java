package javaproject1;

public class Removetheduplicateelment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr [] = {1,2,2,3,3,4,4,5,8,8,9,9};
      
      for(int i=0;i<arr.length-1;i++){
    	  for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				System.out.print(arr[i] + " ");
				
			}
		}
	}

}
}