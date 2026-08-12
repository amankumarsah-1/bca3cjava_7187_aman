
import java.util.Scanner;

class calculate {

    int Firstnum;
    int Secondnum;

    void add() {
        System.out.println("Your Addition is : " + (Firstnum + Secondnum));
    }

    void sub() {
        System.out.println("Your Subtraction is : " + (Firstnum - Secondnum));
    }

    void mul() {
        System.out.println("Your multiplication is : " + (Firstnum * Secondnum));
    }

    void div() {
        System.out.println("Your division is : " + (Firstnum / Secondnum));

    }

    void mod() {
        System.out.println("Your modulas is : " + (Firstnum % Secondnum));
    }
}

class userinput extends calculate {

    void getVal() {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter Your First number : ");
        Firstnum = input.nextInt();

        System.out.print("please enter Your Second number : ");
        Secondnum = input.nextInt();

    }
}

public class calculator {

    public static void main(String[] args) {
        userinput ui = new userinput();
        ui.getVal();
        ui.add();
        ui.sub();
        ui.mul();
        ui.div();
        ui.mod();
    }
}
