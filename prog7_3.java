import java.util.Scanner;

 public class prog7_2{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Welcome to check portal you are pass or fail !!");
 
 System.out.print("please enter your exam score : ");
 int num = input.nextInt();
 
 if (num >=30 && num <=85){
	 System.out.println("you are pass: "); 
 }
 else if (num >=85 && num <= 100){
	 System.out.println("congratulation you got good marks");
 }
 
 else{
	 System.out.println("sorry you are fail ");
 }

}
}