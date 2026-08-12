

class A{
    void sum(int A, int B ){
        System.out.println("Your Sum of A + B = " + (A + B));
    }
}
class B extends A{
    void sum(int A , int B) {
        System.out.println("Your Sum of A + B + C = " + (A + B ));
    }
}


public class calculateoverriding{
   public static void main(String[] args) {
       B Sum = new B();

       Sum.sum(20, 50);
       Sum.sum(20,30);
   }
}