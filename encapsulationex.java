
import java.util.Scanner;

public class encapsulationex{
    private String Name;

    public void getName() {
       System.out.println("My Name is : " + Name);
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        encapsulationex myname = new encapsulationex();

        System.out.print("Please Enter Your Name : ");
        String name = input.nextLine();

        myname.setName(name);
        myname.getName();
    }
}