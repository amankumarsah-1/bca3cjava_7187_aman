import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testThrows {
    static void readFile() throws IOException {
        FileWriter file = new FileWriter("Vivaa_notes.txt");
        FileWriter writer ;
        FileReader myfile = new FileReader("Vivaa_notes.txt");
        BufferedReader br = new BufferedReader(myfile);
        System.out.println(br.readLine());
    }
    public static void main(String[] args) {
        try{
            readFile();

        }catch(IOException e){
            System.out.println("caller hanled file error for vivaan : " + e.getMessage());
        }
    }
    
}
