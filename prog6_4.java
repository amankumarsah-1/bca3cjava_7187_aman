//WRITE A JAVA PROGRAM TO GET A NUMBER FROM USER AND RUN THE LOOP ACCORDING TO THE NUMBER.

  import java.util.Scanner;
 
 class prog6_4{
	 
		public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your number: ");
		int a = scn.nextInt();
		
		int i;
		for(i=0;i<=a;i++){
		System.out.println(i);	
		}
		
		}
 }