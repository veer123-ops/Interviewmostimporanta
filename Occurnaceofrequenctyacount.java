package veer.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;




public class Occurnaceofrequenctyacount {

	public static void Counstring(String string) {
  Map<Character, Integer> map= new HashMap<>();
  char char1 [] =string.toCharArray();
  for(char char2:char1) {
	  map.put(char2, map.getOrDefault(char2, 0)+1);
	  }
  for(Map.Entry<Character, Integer> entry:map.entrySet()) {
	  System.out.println(entry.getKey() + "  =  " +  entry.getValue());
  }
	}
 	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="dfvdvbnvfnb";
   Counstring(string);
	}

}
