package javaproject1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Removethedupcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String string [] = {"veer" ,"aja","veer","goot","raja","name","sad","ram"};
 
		  String[] uniqueArray = removeDuplicates(string);

  printArray(uniqueArray);
}
		  public static String[] removeDuplicates(String[] array) {
      Set<String> uniqueSet = new HashSet<>(Arrays.asList(array));
      return uniqueSet.toArray(new String[0]);
  }
		  public static void printArray(String[] array) {
		        for (String str : array) { 
		            System.out.print(str + " ");
		        }
		        System.out.println();
		    }
}