package javaproject1;


public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string [] = {"veer","raja","ama","mummy"};
  
  String teString;
  
  for (int i = 0; i <string.length; i++) {
	for (int j = 0; j < string.length-1-i; j++) {
		if(string[j].compareTo(string[j+1])>0) {
			teString=string[j];
			string[j]=string[j+1];
			string[j+1]=teString;
		}
	}
  }
	for (int j = 0; j < string.length; j++) {
		System.out.print(string[j] + "  ");
	
}
	
	}

}

  
  
 