package javaproject1;

import java.security.PublicKey;
import java.util.Arrays;

public class Stringsortseconf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"veer","raja","abhi","car"};
		Arrays.sort(str);
		Sort(str);
		
	}


public static void Sort(String []string) {
	for(String valString :string) {
		System.out.print(valString  + " ");
	}
	

}
}