package global;

public class findethemaxinum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] n= {10,52,96,23,69,99};
 int max=n[0];
 int min=n[0];
 for(int i =0;i<n.length;i++) {
	 ///if(n[i]>max) {
		// max=n[i];
	 //}
	// 
	 if(n[i]<min) {
		 min=n[i];
	 }
 } 
	 System.out.print(min);
 }
	}


 