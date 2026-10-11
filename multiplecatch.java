

public class multiplecatch {
    public static void main(String[] args) {
        try {
        int[] vivaanScore = new int[3];

        vivaanScore[0] = 95;
        vivaanScore[1] = 90;
        vivaanScore[2] = 85;

        vivaanScore[5] = 100;
            
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error ocurred");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error : vivaan accessed an invalid index !");
        }
        catch(Exception e){
             System.out.println("general exception hendlar : " + e);
         }
    }
}
