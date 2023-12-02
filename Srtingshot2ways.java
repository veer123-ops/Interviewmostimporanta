package global;
import java.util.Arrays;
public class Srtingshot2ways {
	//package interview.com;
	//import java.util.Arrays;
	//public class Srtingshot2ways {
		//public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			/* String str[]= {"veer","raja","abhi","apple","car"};
			 String temp;
			 
			for(int i=0;i<str.length;i++) { 
				  for(int j=0;j<str.length-1-i;j++) { 
					  if(str[j].compareTo(str[j+1])>0) {
						  
						  temp=str[j];
						s  str[j]=str[j+1];
						  str[j+1]=temp;
						  
					 }
				  }
			 } 
			for(int i=0;i<str.length;i++) { 
		 
	 System.out.println(str[i]+"");
	 }
		}


	}*/


			public static void main(String[] args) {
				
				String[] strArray = {"Apple", "Orange", "Banana", "Apple", "Grape", "Banana", "Orange"};
				Arrays.sort(strArray);
				sortig(strArray);
				
			}
				public static  void sortig (String [] strArray1) {
					for (String valString :strArray1){
					System.out.print(valString + " ");
						
					}
					
					System.out.println();
				}

			}
