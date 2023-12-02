package javaproject1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class contnumberfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr []= {10,20,30,50,89,36,3,69};
 
 HashMap<Integer, Integer> stHashMap =new HashMap<>();
 for(int val : arr) {
	 stHashMap.put(val, stHashMap.getOrDefault(val, 0)+1);
 }for(Map.Entry<Integer, Integer> entry :stHashMap.entrySet()) {
	 System.out.print(entry.getKey() + " " + entry.getValue());
 }
	}

}
