 package veer.com;



public class LongconstiveooCrrance {
	
//public static int longcositve(int [] nums,int target) {
	
	/*int count =0;
	int max=0;
	for(int val : nums) {
		if(val==target) {
			count++;
			max=Math.max(max, count);
			
		}else {
			count=0;
		}
	}
	return max;
	
}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {1, 2, 2, 3, 3, 3, 4, 4, 4,4 ,4,4, 5, 5};
		 
		 int data =4;
		 System.out.print(longcositve(numbers, data));
	}

}
	*/
	public static void main(String[] args) {
int[] arr = { 100,4,200,1,2,3 };

int count = 0;
int max =0;

for(int i = 0; i < arr.length-1; i++) {
if(arr[i] +1== arr[i+1]) {
count++;
}else {
count = 0;
}

max = Math.max(max, count+1);
}
System.out.println(max);
}

} 

/*
int count=0;
int max=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==arr[i+1]) {
		count++;
	}else {
		count=0;
		
	}
	
	max=Math.max(max, count+1);
		
}
	System.out.print(max);	
	}*/
