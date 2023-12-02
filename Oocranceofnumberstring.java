package veer.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Oocranceofnumberstring {
	
	public static void  Occuraanofnumber(int arr1 [] ) {
		Map<Integer, Integer> map =new HashMap<>();
		
		for(int val:arr1 ) {
			map.put(val, map.getOrDefault(val, 0)+1);
		}
		for(Map .Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " =  " + entry.getValue());
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr [] = {10,20,50,6,3,3,3};
 Occuraanofnumber(arr);
 
	}

}
