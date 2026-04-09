package database;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class ddl extends JFrame implements ActionListener {
    JButton j1,j2,j3;
    JLabel l1;
    JTextField t1;
    Connection c;
    Statement s;
    public ddl(){
        setTitle("DDL Query");
        setSize(300, 400);
        setLayout(new FlowLayout());
        l1=new JLabel("Enter DDL Query Here : ",JLabel.CENTER);
        add(l1);
        t1=new JTextField(20);
        add(t1);
        add(j1=new JButton("Create Table"));
        add(j2=new JButton("Alter Table"));
        add(j3=new JButton("Insert Table"));
        j1.addActionListener(this);
        j2.addActionListener(this);
        j3.addActionListener(this);
        try{
              //Class.forName("org.postgresql.Driver");
              Class.forName("org.postgresql.Driver");
              System.out.println("load");
              c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgreuser");
              System.out.println("error"+c);
              s=c.createStatement();
            }catch(Exception e){
                System.out.println(e);
            }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ev){
        String str=t1.getText();
              try{
                if(s==null){
                    JOptionPane.showMessageDialog(this,"Not Established");
                    return;
                }
             s.executeUpdate(str);
             JOptionPane.showMessageDialog(this,"Successfully Execute Query");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Error"+ex.getMessage());
            }
    }
    public static void main(String[] args) {
        new ddl();
    }
    
}
