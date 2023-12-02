package javaproject1;

public class Shiftzero {
	
	public static void Shiftzero(int arr []) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,10,20,0,5,3,0,9,62,0,36,5,2,1}; 
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j]== 0 && arr[j+1]!=0) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		Shiftzero(arr);
	}

}
