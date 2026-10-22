
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            Statement stmt = cn.createStatement();
            Scanner sc = new Scanner(System.in);
            int grno=0;
            System.out.print("Enter grno : ");
            grno = sc.nextInt();
            System.out.println(" ");
            String name = "";
            System.out.print("Enter name : ");
            name = sc.next();
            try{
                int x = stmt.executeUpdate("insert into stud values("+grno+",'"+name+"')");
                System.out.println("No of row Inserted : " +x);

            }catch(Exception e){
                System.out.println("Exception :" +e);
            }
            cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}