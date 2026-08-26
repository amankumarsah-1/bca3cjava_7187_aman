

abstract class Animal{
 public abstract void animalSound();
 
public void sleep(){
    System.out.println("Zzzzzzz''''' ");
}
}

class dog extends Animal{
    public void animalSound(){
        System.err.println("The dog Says : woof woof ");
    }
}

public class abs123tract{
    public static void main(String[] args) {
        dog mydog = new dog();

        mydog.animalSound();
        mydog.sleep();
    }
}