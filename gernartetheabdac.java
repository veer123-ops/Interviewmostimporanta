package veer.com;

import java.awt.RenderingHints.Key;

public class gernartetheabdac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="a2b3c4a2b3c4";
    for(int i=0;i<string.length();i++) {
    	if(Character.isAlphabetic(string.charAt(i))) {
    		System.out.print(string.charAt(i));
    	}else {
    		int x= Character.getNumericValue(string.charAt(i));
    		for(int j=0;j<x;j++) {
    			System.out.print(string.charAt(i-1));
    		}
    	}
    	
    }
    	
	
	}}