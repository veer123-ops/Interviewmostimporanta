package javaproject1;

public class Countthevowleandconsate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string= "veerhgvhdmsahjghhg";
	    int vowel=0;
	    int conso=0;
	   // char ch;
	    
	    for(int i=0;i<string.length();i++) { 
	    	char ch=string.charAt(i);
	    	if(  ch!=' ') {
	    		if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')) 
					 vowel++;
	    	else 
	    		conso++;
	    	}
	    }
		
		 System.out.print(vowel+" print vowel "+ conso + " consatnec");
		}

	
}
