package database;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class JTablee {
    public static void main(String[] args) {
        JFrame f=new JFrame("Teacher Info Using Swing");
       f.setTitle("Using swing");
       
       DefaultTableModel m=new DefaultTableModel();
       m.addColumn("Tno");
       m.addColumn("Tname");
       m.addColumn("Tsub");
       
       JTable t=new JTable(m);
       
       try{
            Class.forName("org.postgresql.Driver");
            Connection c=DriverManager.getConnection(url,username,password);
            
            Statement s=c.createStatement();
            ResultSet r=s.executeQuery("select * from teacher");
            while (r.next()) {
                m.addRow(new Object[]{
                 r.getInt(1),
                 r.getString(2),
                 r.getString(3)
                });
            }
            c.close();

       }catch(Exception e){
        System.out.println(e);
       }
       //f.add(new JScrollable(t));
       f.add(new JScrollPane(t));
       f.setSize(500,300);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}
