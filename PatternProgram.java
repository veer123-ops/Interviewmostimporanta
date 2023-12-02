package global;

import java.util.Scanner;



	public class PatternProgram {

		
		    public static void main(String[] args) {
		        int n = 8; // Define the number of rows

		        // Loop to iterate through rows
		        for (int i = 1; i <= n; i++) {
		            // Loop to iterate through columns
		            for (int j = 1; j <= n; j++) {
		                // Print spaces or the numbers based on conditions
		                if (i == 1 || i == 2 || i == n) {
		                    if (j == 1 || j == 2 || j == n) {
		                        System.out.print(j + " ");
		                    
		                }
		            }
		            // Move to the next line after each row is printed
		            System.out.println();
		        }
		    }
	}}
