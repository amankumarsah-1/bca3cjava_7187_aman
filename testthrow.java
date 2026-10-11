public class testthrow {
    static void checkvotingeligiblity(int age , String name) {
        if(age < 18){
            throw  new  ArithmeticException(name + "is not eligible to vote (age must be 18+). ");
        }else{
            System.out.println(name +" is Eligible to vore !");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Checking registration fo vivaan..");
            checkvotingeligiblity(16, "vivaan");
        }catch(ArithmeticException e){
            System.out.println("Caught Explicit Exception : " + e.getMessage());
        }
    }
    
}
