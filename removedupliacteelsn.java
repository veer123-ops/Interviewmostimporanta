package javaproject1;


import java.util.HashSet;

public class removedupliacteelsn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr [] = {10,2,5,6,9,5,6,8,9,5};
  HashSet<Integer> set=new HashSet<>();
  
  for (int i = 0; i < arr.length; i++) {
	set.add(arr[i]);
		
	}
  for (Integer integer : set) {
	System.out.print(integer + "  ");
}
}
	}


