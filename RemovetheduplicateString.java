package veer.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemovetheduplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] strArray = {"Apple", "Orange", "Banana", "Apple", "Grape", "Banana", "Orange"};
		 
		 
		 String[] uniqueArray = removeDuplicates(strArray);

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



///




	// String[] strArray = {"Apple", "Orange", "Banana", "Apple", "Grape", "Banana", "Orange"};

		/* boolean flag=false;
		
	 for(int i=0;i<strArray.length;i++) {
			 for(int j=i+1;j<strArray.length;j++) {
				 if(strArray[i]==strArray[j]) {
					 System.out.print( strArray[i] + "  ");
				 }
			 }
		 }
		 
		 
		 		
				}
		}
	}
 if(flag==false) { 
	 System.out.print("dc not");
 }
	}


}
*/
		 
