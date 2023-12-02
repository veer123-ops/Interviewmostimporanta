package veer.com;


public class permutionsstring {
	
	public static void permutions(String string ,String string2) {
		if(string2.length()==0) {
			System.out.print(string + " ");
			return;
		}
		
		for(int i=0;i<string2.length();i++) {
		  String revString=string2.substring(0,i) + string2.substring(i+1);
		  permutions(string +  string2.charAt(i),revString);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="abc";
   permutions("" , string);
	}

}


/*








// Java program to print all permutations of a 
// given string. 
public class Permutation { 

	// Function call 
	public static void main(String[] args) 
	{ 
		String str = "ABC"; 
		int n = str.length(); 
		Permutation permutation = new Permutation(); 
		permutation.permute(str, 0, n - 1); 
	} 
	
	* permutation function 
	* @param str string to calculate permutation for 
	* @param l starting index 
	* @param r end index 
	*
	private void permute(String str, int l, int r) 
	{ 
		if (l == r) 
			System.out.println(str); 
		else { 
			for (int i = l; i <= r; i++) { 
				str = swap(str, l, i); 
				permute(str, l + 1, r); 
				str = swap(str, l, i); 
			} 
		} 
	} 

	
	* Swap Characters at position 
	* @param a string value 
	* @param i position 1 
	* @param j position 2 
	* @return swapped string 
	
	public String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i]; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 
} 

*/












