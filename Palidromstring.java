package javaproject1;

public class Palidromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String string="ABA";
    String string2="";
    
    for (int i=string.length()-1;i>=0;i--) {
		string2=string2+string.charAt(i);
    }if (string.equals(string2)) {
    	
		System.out.print(string + " palindrom sting");
    }else { 
		System.out.print(string + " this is not palindeom string");
	}
	}

}
