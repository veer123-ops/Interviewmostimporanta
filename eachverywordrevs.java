package javaproject1;



public class eachverywordrevs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String string ="veer is good";
  String [] strings =string.split("\\s");
  String reString="";
  for(String w:strings) {
	 StringBuilder stringBuilder=new StringBuilder(w);
	 stringBuilder.reverse();
	 reString=reString+stringBuilder.toString()+ " ";
	 
  }
  System.out.print(reString + " ");
	}

}
