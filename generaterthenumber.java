package veer.com;

import javax.imageio.ImageTranscoder;

public class generaterthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String string="aaabbbbcccccaaabbbbccccc";
      StringBuilder stringBuilder=new StringBuilder();
      
     int count=1; 
     
     for(int i=0;i<string.length()-1;i++) {
    	 if(i<string.length()-1 && string.charAt(i) == string.charAt(i+1)) {
    		 count++;
    	 }else {
    		 stringBuilder.append(string.charAt(i));
    		 stringBuilder.append(count);
    		 count=1;
    	 }
     }
     
     System.out.print(stringBuilder.toString());
	}}