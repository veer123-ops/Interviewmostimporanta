package javaproject1;

public class Palndromstingcheck {
	
	public static boolean isPaldriomstrin(String str) {
		int n=str.length();
		for (int i = 0; i <n/2; i++) {
			if(!str.substring(i,i+1).equals(str.substring(n-i-1,n-i))) {
				return false;
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string [] = {"veer","nitin","aba"};
  for (String str : string) {
	System.out.println(isPaldriomstrin(str));
}
	}

}
