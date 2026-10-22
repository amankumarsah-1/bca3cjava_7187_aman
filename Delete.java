
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Delete{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","");
            Statement stmt = cn.createStatement();
            Scanner sc = new Scanner(System.in);
            int grno=0;
            System.out.print("Enter grno. for which you want to Delet : ");
            grno = sc.nextInt();
            try{
                int x = stmt.executeUpdate("delete from stud where grno ="+grno);
                System.out.println("No of row Affected : " +x);

            }catch(Exception e){
                System.out.println("Exception :" +e);
            }
            cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}