import java.util.Scanner;

 public class prog7_1{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 
 System.out.print("please enter your exam score : ");
 int num = input.nextInt();
 if (num >=30 && num <=100){
	 System.out.println("you are pass : "); 
 }
}
}