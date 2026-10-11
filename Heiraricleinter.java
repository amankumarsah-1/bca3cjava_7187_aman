
class Animal {

    void eat() {
        System.out.println("Animal is eating....");
    }
}

class dog extends Animal {

    void makeSound() {
        System.out.println("Woof ... Woof ...!");
    }
}

interface Pet_Animal {

    void Drink();
}

class puppy extends dog implements Pet_Animal {

    public void Drink() {
        System.out.println("Puppy is Drinking milk....");

    }

    void DrinkMilk() {
        System.out.println("Puppy is drinkig Milk");
    }

}

public class Heiraricleinter {

    public static void main(String[] args) {
        puppy mypuppy = new puppy();
        mypuppy.Drink();
        mypuppy.DrinkMilk();
        mypuppy.eat();
        mypuppy.makeSound();

    }
}
