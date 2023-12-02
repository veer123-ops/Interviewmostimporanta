package global;

public class maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int [] arr= {1,2,4,89,63,89};
  int max=arr[0];
  
  for(int i=1;i<arr.length;i++) {
	  
	  if(arr[i]>max) {
		  max=arr[i];
	  }
	  }
	  System.out.print(max);
  }
	

}
