package global;

public class minimub {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	  int [] arr= {1,2,4,89,63,89};
	  int min=arr[0];
	   
	  for(int i=0;i<arr.length;i++) {
		  
		  if(arr[i]<min) {
			  min=arr[i];
		  }
		  }
		  System.out.print(min);
	  
	}

	

}
