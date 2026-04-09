package database;
import java.sql.*;
public class MetaData {
    public static void main(String[] args) {
    try{
          Class.forName("org.postgresql.Driver");
          Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/pguser","postgres","postgreuser");
          DatabaseMetaData db=c.getMetaData();
          System.out.println("Product name : "+db.getDatabaseProductName());
          System.out.println("Product Version:"+db.getDatabaseProductVersion());
          System.out.println("Driver Name :"+db.getDriverName());
          System.out.println("Driver Version :"+db.getDriverVersion());
          System.out.println("UserName : "+db.getUserName());
          ResultSet rs=db.getTables(null,null,"%",new String[]{"TABLE"});
          while (rs.next()) {
            System.out.println(rs.getString("TABLE_NAME"));
          }
          c.close();

    }catch(Exception e){
        System.out.println(e);
    }
  }
}
