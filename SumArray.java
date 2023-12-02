 package global;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] num= {10,52,99,3,8,6,9,23};
    
    int sum=0;
    
    for(int i=0;i<num.length-1;i++) {
    	sum=sum+num[i];
    }
    System.out.print(sum);
	}

}
