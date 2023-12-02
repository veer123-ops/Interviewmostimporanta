 package veer.com;

public class revesreword {
	
	public static String revesreword1(String s) {
		String w1=" ";
		String []  worStrings=s.split("\\s+");
		for(String w: worStrings) {
			if(w1=="") w1=w;
			else w1=w + " "+ w1;
		}
		return w1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String string="the is good";
   System.out.print(revesreword1(string));
   
	}

}