package veer.com;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string="veer";
  String string2="raja";
  
  char x [] = string.toCharArray();
  char y[]= string2.toCharArray();
  
  Arrays.sort(x);
  Arrays.sort(y);
  boolean result = Arrays.equals(x, y);
 if(result==true) {
	 System.out.print(string  + " this is anagram string");
 }else {
	 System.out.print(string2 + " this is not anagram string");
 }
	}}