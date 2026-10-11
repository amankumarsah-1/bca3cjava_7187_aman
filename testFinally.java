public class testFinally {
    public static void main(String[] args) {
        try{
            System.out.println("vivaan opening database connection....");
            int data = 25 / 0;
            System.out.println("data calculated " + data);
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught.");
        }
        finally{
            System.out.println("Finally Bloack : closing Vivaan's database connection... guaranteed!");
        }
    }
}
