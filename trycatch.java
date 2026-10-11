


import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Studentname = "vivaan";
        System.out.println(Studentname+" started math calculation");

        System.out.print("Please Enter Your First Number ");
        int num1 = input.nextInt();

        System.out.print("now Enter Your Second Number ");
        int num2 = input.nextInt();
try {
    int result = num1 / num2;
        System.out.println("Result " + result);

} catch (ArithmeticException e) {
    System.out.println("Exception caught : divided by zero not allowed for " + Studentname +"!");
    System.out.println("System error detail " + e.getMessage());
}

        System.out.println(Studentname+"'s program continue execution smothly");
    }
}
