package javaproject1;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		String str[]= {"veer","raja","abhi","car" ,"car"};
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
  
	
