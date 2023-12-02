package javaproject1;

public class firstnonreaptingquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String srString ="javava";
   
   for (int i = 0; i <srString.length(); i++) {
	int count=0;
	
	for (int j = 0; j <srString.length(); j++) {
		if (srString.charAt(i)==srString.charAt(j)) {
			count++;
		}
	}
	
	if(count==1) {  // this first non reapting questions
		System.out.print(srString.charAt(i));
		
	}
}
	}

}
