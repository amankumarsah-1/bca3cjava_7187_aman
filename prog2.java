// WRITE A SIMPLE PROGRAM TO GET A NAME FROM USER AND DISPLAY ON SCREEN.
  
 import java.util.Scanner;
 
 class input{
		
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your name:");
		String name = scn.nextLine();
		
		System.out.println("your name is:"+ name);
		
		}
 }
   
 