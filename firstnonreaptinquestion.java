package veer.com;

import org.w3c.dom.DOMStringList;

public class firstnonreaptinquestion {

	public static void main(String[] args) {
		String string ="javvadffdf";
		
		for(int i=0;i<string.length();i++) {
			int count=0;
			for(int j=0;j<string.length();j++) {
				if(string.charAt(i)== string.charAt(j)) {
					count++;
				}
			} 
			
			//if(count==1) {  // non reaptingquestionques
				if(count>1) {
					System.out.print(string.charAt(i));
				}
				//System.out.print(string.charAt(i));
			}
		}
	}