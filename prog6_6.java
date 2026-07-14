//WRITE A PROGRAM TO GET A NUMBER FROM USER AND RUN THE DO-WHILE LOOP ACCORDING  TO GIVEN NUMBER.

import java.util.Scanner;

 class prog6_6{
    
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your number:");
		int a = scn.nextInt();
		
		int i=0;
		do{
		 System.out.println(i);
		 i++;
		}while(i<=a);
		
		}
 
 } 