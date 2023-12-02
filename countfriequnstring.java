package javaproject1;

import java.util.HashMap;
import java.util.Map;

public class countfriequnstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string ="jfnsdjjkdkjdjfkdjkgfgjbj";
   char x [] =string.toCharArray();
   
  HashMap<Character, Integer> map=new HashMap<>();
  for (char val :x) {
	  map.put(val, map.getOrDefault(val, 0)+1);
	  
	
}for(Map.Entry<Character, Integer> entry: map.entrySet() ) {
	
	System.out.println(entry.getKey()+ " "+ entry.getValue());
}
	}

}
