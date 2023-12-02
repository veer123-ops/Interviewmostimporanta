package veer;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
     int rev=0; 
     int org=n;
     int sum=0;
     
     while(n!=0) {
    	 rev=n%10;
			
			sum=rev*rev*rev+sum;
			n=n/10;
     }
     //n=n/10;
     if(org==sum) {
    	 System.out.print(org+"Amstrong number");
     }else {
    	 System.out.print(org+"Amstrong to not number");
     }
		
	}

}
/*






int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}





*/