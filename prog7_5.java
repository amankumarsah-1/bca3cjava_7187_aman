import java.util.Scanner;

 public class prog7_5{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Welcome to  !!");
 
 System.out.print("please enter your exam score : ");
 int num = input.nextInt();
 
 if (num >=30 && num <=80){
	 System.out.println("you are pass !!");
	 else{
	 System.out.println("sorry you are fail");
 }
 }
 if(num >=80 && num <=100){
	 System.out.println("you are got good score ");
	 else{
	 System.out.println("sorry you are fail....");
 }
 }
}
}