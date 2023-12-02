package javaproject1;

//public class Syhornatios {

	// Java program to illustrate need 
	// of Synchronization 
	import java.io.*; 

	class Multithread 
	{ 
		private int i = 0; 
		public void increment() 
		{ 
			i++; 
		} 

		public int getValue() 
		{ 
			return i; 
		} 
	} 

	class GfG 
	{ 
		public static void main (String[] args) 
		{ 
			Multithread t = new Multithread(); 
			t.increment(); 
			System.out.println(t.getValue()); 
		} 
	} 
