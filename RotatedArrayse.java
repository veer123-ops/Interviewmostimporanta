package veer.com;

import java.util.Arrays;

public class RotatedArrayse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int arr [] = {1,2,3,4,5};
		 int n=4;
		 for(int i=0;i<n;i++) {
			 int first=arr[0],j;
			 
			 for(j=0;j<arr.length-1;j++) {
				 arr[j]=arr[j+1];
			 }
			 arr[j]=first;
		 }
		 
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i]  + " "); 
			 
		}
	}

}



  /*  public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        reverse(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[],int d)
    {
        for(int i=0;i<d;i++)
        {
            swap(arr,0);
        }
    }
    public static void swap(int arr[],int index)
    {
        int temp=arr[index];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

    }

}*/