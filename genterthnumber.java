package javaproject1;

public class genterthnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String srString ="aaavvvbbbcccbb";
   StringBuilder stringBuilder =new StringBuilder();
   int count=1;
   for (int i = 0; i <srString.length()-1; i++) {
	if(i<srString.length()-1 && srString.charAt(i)==srString.charAt(i+1)) {
		count++;
		
	}else {
		stringBuilder.append(srString.charAt(i)); 
		stringBuilder.append(count);
		count=1;
	}
}
   
   System.out.print(stringBuilder.toString());
	}

}
