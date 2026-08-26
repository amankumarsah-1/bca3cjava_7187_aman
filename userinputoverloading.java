
import java.util.Scanner;

public class userinputoverloading {

    void sum(int A, int B) {
        System.out.println("Your Sum of A + B = " + (A + B));

    }

    void sum(int A, int B, int C) {
        System.out.println("Your Sum of A + B + C = " + (A + B + C));
    }

    public static void main(String[] args) {
        calculateoverloading Sum = new calculateoverloading();
        Scanner input = new Scanner(System.in);

        System.out.print("please enter your 1st number :  ");
        int A = input.nextInt();
        System.out.print("please enter your 2st number :  ");
        int B = input.nextInt();
        System.out.print("please enter your 3st number :  ");
        int C = input.nextInt();
        Sum.sum(A, B);
        Sum.sum(A, B, C);

    }

}
