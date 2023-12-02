package veer.com;

public class Substringpalidromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String string= "nitin ";
 
 for(int i=0;i<string.length();i++) {
	 for(int j=i+1;j<string.length();j++) {
		 System.out.println(string.substring( i,j));
	 }
 }
	}

}
