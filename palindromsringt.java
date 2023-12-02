package veer.com;

import java.util.HashSet;

public class palindromsringt {
	
	static int maxlenghth=0;
	public static  void isPalidrom(String str,int left,int right,HashSet<String> set) {
		while((left>=0 && right <str.length()) && (str.charAt(left)==str.charAt(right))){
			set.add(str.substring(left,right+1));
			if (str.substring(left,right+1).length()>maxlenghth)maxlenghth =str.substring(left,right+1).length() ;
			left--;
			right++;
			
		}
	}
	
	
	public static void grerate(String str) {
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length();i++) {
			isPalidrom(str, i, i, set);
			isPalidrom(str, i, i+1, set);
		}
		System.out.println(set);
		System.out.print("longestmmm  =  " + maxlenghth);
	}
	public static void main(String[] args) {
		
		String string="NITIN";
		grerate(string);
} 
}