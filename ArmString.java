package com.xworkz.taskapp;

public class ArmString {

	public static void main(String[] args) {
		
		int i=100,arm;
		System.out.println("Armstrong numbers between 100 to 999");
		while(i<1000)
		{
		arm=armstrongOrNot(i);
		if(arm==i)
		System.out.println(i);
		i++;
		}
		}
	static int armstrongOrNot(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}

        /*int number = 371, originalNumber, remainder, result = 0;
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
            System.out.println(number + " is not an Armstrong number.");*/
        
        /*int number = 1634, originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10, ++n);
        originalNumber = number;
        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");*/
    
}
