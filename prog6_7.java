// WRITE A JAVA PROGRAM TO GET A NAME AND NUMBER FROM USER AND RUN THE FOR LOOP ACCORDING TO GIVEN NUMBER.

import java.util.Scanner;

 class prog6_7{
		
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.print("enter your name");
	String name = scn.nextLine();
	
	System.out.print("enter your number");
    int a = scn.nextInt();

	int i;
	for(i=0;i<=a;i++){
	  System.out.println(i + name);
	}
	
	}
	
 }

