//WRITE A JAVA PROGRAM TO GET A NUMBER FROM USER AND RUN A WHILE LOOP ACCORDING TO GIVEN NUMBER.

import java.util.Scanner;

  class prog6_5{
  
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your number");
		int a = scn.nextInt();
		
		int i=0;
		while(i<=a){
		System.out.println(i);
		i++;
		}
		}
  
  } 