

class vehicle{
    int speed = 120;

    vehicle() {
        System.out.println("vehicle constructor called");
    }
    void run(){
        System.out.println("vehicle is runnig");
    }
    
}

class Car extends vehicle{
    int speed = 180;

    Car() {
        super();
    }

    void Display(){
        System.out.println("Car speed : "+ speed);
        System.out.println("Parent vehicle Speed : " + super.speed);
        super.run();
    }

    
}

public class superkyword{
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.Display();
    }
}