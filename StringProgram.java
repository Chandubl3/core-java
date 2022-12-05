package com.xworkz.taskapp;

public class StringProgram {

	public static void main(String args[]) {
		
		String name = "Java Program";
		System.out.println(name);
		
		//inbuilt 
		for(int i=0; i<name.length(); i++) {
			System.out.print(" "+name.charAt(i));
		}
		
		//reverse
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(" "+name.charAt(i));
		}
		
		//count
		int count=0;
		int count1=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a') {
				count+=1;
			}
			else {
				count1+=1;
			}
		}
		System.out.println("Count :"+count);
		System.out.println("Count1 :"+count1);
		
		String message = "Good Morning";
		int count2=0;
		int count3=0;
		for(char ch:message.toCharArray()) {
			if(ch=='o') {
				count2+=1;
			}
			else {
				count3+=1;
			}
			System.out.print(ch+" ");
		}
		System.out.println("count2 :"+count2);
		System.out.println("count3 :"+count3);
		
		String nm = "Chandu";
		String reverse = "";
		for(int i=name.length()-1; i>=0; i--) {
			System.out.print(" "+name.charAt(i));
		}
		if(nm.equals(reverse)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not same");
		}
	}
}
