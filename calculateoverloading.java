
public class calculateoverloading {

    void sum(int A, int B) {
        System.out.println("Your Sum of A + B = " + (A + B));

    }

    void sum(int A, int B, int C) {
        System.out.println("Your Sum of A + B + C = " + (A + B + C));
    }

    public static void main(String[] args) {
        calculateoverloading Sum = new calculateoverloading();
        Sum.sum(10, 20);
        Sum.sum(20, 20, 50);

    }

}
