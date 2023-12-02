package global;

public class ducticatstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String str[]= {"veer","raja","abhi","car","veer"};
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i]==str[j]) {
					System.out.print(str[i]   +    "   dc    ");
					flag = true;
					
				}
		}
	}
 if(flag==false) { 
	 System.out.print("dc not");
 }
	}}
  

/*





import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] strArray = {"Apple", "Orange", "Banana", "Apple", "Grape", "Banana", "Orange"};

        System.out.println("Original Array:");
        printArray(strArray);

        String[] uniqueArray = removeDuplicates(strArray);

        System.out.println("\nArray after removing duplicates:");
        printArray(uniqueArray);
    }

    // Function to remove duplicates from an array of strings
    public static String[] removeDuplicates(String[] array) {
        Set<String> uniqueSet = new HashSet<>(Arrays.asList(array));
        return uniqueSet.toArray(new String[0]);
    }

    // Function to print an array of strings
    public static void printArray(String[] array) {
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}









*/