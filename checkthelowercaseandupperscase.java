package global;

public class checkthelowercaseandupperscase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="this is Good Boy this is good boy";
     int mid=str.length()/2; 
     String lowerCase=" ";
     String upperCase=" ";
     
     for(int i=0;i<str.length();i++) {
    	 if(i<mid) {
    		 lowerCase=lowerCase+Character.toLowerCase(str.charAt(i));
    	 }else {
    		 
    		 upperCase=upperCase+Character.toUpperCase(str.charAt(i));
    	 }
     }
     System.out.print(lowerCase+upperCase);
	}

} 

 