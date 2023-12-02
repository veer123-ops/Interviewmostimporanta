package global;

public class Secondlargestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,8,91,3,6,9,10,5,1};
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				} 
			}
		}
		//for(int i=0;i<arr.length;i++) {
			//
			
			//System.out.print(arr[i]+" ");
		
  System.out.println(" grater "+ arr[1]);
	}

}

	
 

 