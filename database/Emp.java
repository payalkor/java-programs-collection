package database;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Emp extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton b;
    JLabel l1,l2,l3;
    public Emp(){
        setTitle("Employee Details");
        setLayout(new FlowLayout());
        l1=new JLabel("Emp no");
        l2=new JLabel("Emp name");
        l3=new JLabel("Emp Salary");
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b =new JButton("Insert"));
        b.addActionListener(this);
        setSize(300,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        int eno=Integer.parseInt(t1.getText());
        String enm=t2.getText();
        float esal=Float.parseFloat(t3.getText());
        try{
            Class.forName("org.postgresql.Driver");
            Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgreuser");
           
            PreparedStatement p=c.prepareStatement("insert into employee values(?,?,?)");
            p.setInt(1,eno);
            p.setString(2,enm);
            p.setFloat(3,esal);

            p.executeUpdate();

            JOptionPane.showMessageDialog(this, "Insert Successfully!");
            c.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
    }
    
    public static void main(String[] args) {
        new Emp();
    }
}

