package javaproject1;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class checkequalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr [] = {1,2,3,4};
    int arr1 []= {1,2,3,4,2};
    
    boolean status=Arrays.equals(arr, arr1);
    
    if(status==true) {
    	System.out.print("Arrays equal");
    }else {
    	System.out.print("arrays is not equal");
    }
	}

}
/*

boolean status=true;

if(arr.length==arr1.length){
for(int i=0;i<arr.length;i++){
if(arr[i]!=arr2[i]){
status=false;
}}

else {
status=faslse;
}}
eslse{
status=false;}
if(status==true){
system.out(arrays is sorted);
}*/