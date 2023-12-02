package javaproject1;

public class Revserword {
	
	static String revwoString(String s) {
		String string1="";
		String string2 []=s.split("\\s+");
		for(String wString:string2) {
			if(string1=="") string1=wString;
			else string1 =wString + " " +string1;
		}
		return string1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
   String s="skye the bule";
   
   System.out.print(revwoString(s));
	}

}
