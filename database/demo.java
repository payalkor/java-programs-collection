package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/pguser",
                "postgres",
                "postgreuser"
            );

            System.out.println("Connected successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
