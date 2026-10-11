//write a java program to print the pattern8 from gibven sheet?

class prog9pattern8{

    public static void main(String args[]){

        for(int rows=5;rows>=1;rows--){

            for(int cols=1;cols<=rows;cols++){
                System.out.print(rows);
            }
            System.out.println("");
        }
        
    }
}