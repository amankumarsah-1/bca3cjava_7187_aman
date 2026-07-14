//WRITE A JAVA PROGRAM TO GET PERSONAL INFORMATION FROM USER AND DISPLAY ON SCREEN.

import java.util.Scanner;

	class prog3{
		
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your name:");
		String name = scn.nextLine();
		
		System.out.print("enter your age:");
		int age = scn.nextInt();
		
		System.out.print("enter your mobile number:");
		int mobile = scn.nextInt();
		
		System.out.print("enter your course:");
		String course = scn.nextLine();
		
		
		System.out.println("your name is:"+ name);
		System.out.println("your age is:" + age);
		System.out.println(" your mobile number is:" + mobile);
		System.out.println("your course is:" + course);
		System.out.println("soon we will contact to you");


		}
	
	
	}