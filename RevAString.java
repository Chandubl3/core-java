package com.xworkz.taskapp;

import java.util.Scanner;

public class RevAString {

	public static void main(String[] arg) {

			System.out.println("enter the string");
			Scanner sc = new Scanner(System.in);
			/*String stringInput = sc.next();
	        char[] resultarray = stringInput.toCharArray();
	        for (int i = resultarray.length - 1; i >= 0; i--)
	            System.out.print(resultarray[i]);*/
	        
	        String str = sc.next();
	        StringBuilder sb = new StringBuilder(str);
	        str = sb.reverse().toString();
	        System.out.println("Reversed String : " + str);
	}
}
