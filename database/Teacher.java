package database;
import java.sql.*;
import java.util.Scanner;
public class Teacher {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int tno;
    String tname;
    String tsub;
    try{
         Class.forName("org.postgresql.Driver");
         Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgreuser");
         PreparedStatement ps=c.prepareStatement("insert into teacher values(?,?,?)");
         System.out.println("Enter 5 Rescords : ");
         for(int i=0;i<5;i++){
            System.out.println("Enter Eno,Ename,Esub : ");
             tno=s.nextInt();
             tname=s.next();
             tsub=s.next();

             ps.setInt(1,tno);
             ps.setString(2, tname);
             ps.setString(3,tsub);

             ps.executeUpdate();
         }
         PreparedStatement ps2=c.prepareStatement("Select * from teacher where tsub=?");
         ps2.setString(1,"JAVA");
         ResultSet re=ps2.executeQuery();
         while(re.next()){
            System.out.println("Teacher No:"+re.getInt(1)+
            "Teacher Name :"+re.getString(2)+
            "Teacher Subject:"+re.getString(3));
         }
         c.close();
         s.close();
    
        }catch(Exception e){
        System.out.println(e);
    }
        } 
}
