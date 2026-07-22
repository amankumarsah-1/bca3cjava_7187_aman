import java.util.Scanner;

 public class prog7_4{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Welcome to  !!");
 
 System.out.print("please enter your exam score : ");
 int num = input.nextInt();
 
 if(num <=100){
	 if(num >=30 && num <=100){
		 System.out.println("you are pass !!");
	 }
	 else {
		 System.out.println("you are fail");
	 }
 } else{
	 System.out.println("please enter right number ");
 }
}
}