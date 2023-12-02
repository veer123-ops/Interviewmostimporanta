package global;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrenenusenumber {
	
	public static void countaplhabet(String str) {
		Map<Character,Integer> charMap= new HashMap<Character,Integer>();
		char strArray[]=str.toCharArray();
		for(char c:strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
					charMap.put(c,1);
					
				}
				
			}
		System.out.println(str+" : " +charMap);
		}
		
		
	

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		countaplhabet(str);
		
 
	}

}
