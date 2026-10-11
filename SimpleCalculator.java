
import Addition.Add;
import division.div;
import java.util.Scanner;
import modulas.mod;
import multplication.mult;
import subract.subt;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Add myadd = new Add();
        subt mysub = new subt();
        mult myMult = new mult();
        mod myMod = new mod();
        div myDiv = new div();

        System.out.println("welcome to simple calculator !!");
        System.out.print("Please enter Your First Number  = ");
        int num1 = input.nextInt();
        System.out.print(" Now Please enter Your Second Number  = ");
        int num2 = input.nextInt();

        int Add = myadd.Additions(num1, num2);
        int SuB = mysub.Subract(num1, num2);
        int MuL = myMult.Multiplication(num1, num2);
        int DiV = myDiv.Division(num1, num2);
        int MoD = myMod.Modulas(num1, num2);

        System.out.println("Your Addition Result is = " + Add);
        System.out.println("Your Subtraction Result is = " + SuB);
        System.out.println("Your Multiplication Result is = " + MuL);
        System.out.println("Your Division Result is = " + DiV);
        System.out.println("Your Modulas Result is = " + MoD);
    }
    
}
