//WRITE A JAVA PROGRAM TO PERFORM DIFFERENT ARITHMETIC OPERATION WITHOUT COMMAND LINE ARGS

import java.util.Scanner;

 class prog4_1{
		
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your first value:");
		int a = scn.nextInt();

		System.out.print("enter your second value:");
		int b = scn.nextInt();
		
 		System.out.println("your addition value is:" + (a+b));
		System.out.println("your subtraction value is:" +(a-b));
		System.out.println("your multiplication value is:" + (a*b));
		System.out.println("your division value is:" +(a/b));
		System.out.println("your modulus value is:" + (a%b));
		
		
		}
 }