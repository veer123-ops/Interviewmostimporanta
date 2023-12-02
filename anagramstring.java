package javaproject1;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class anagramstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="veer";
   String string2="veer"; 
   
   char x [] = string.toCharArray();
   char y [] =string.toCharArray();
   Arrays.sort(x);
   Arrays.sort(y);
   
   boolean isbooleaan=Arrays.equals(x, y);
   if(isbooleaan==true) {
	   System.out.print(string + " anagagram string");
   }else {
	   System.out.print(string + " this is not anagram string");
   }
	}

}
