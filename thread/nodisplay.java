package thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
public class nodisplay extends JFrame implements Runnable,ActionListener{
    JTextField t;
    JButton b;
    public nodisplay(){
      setTitle("Print 1 to 1000");
      setLayout(new FlowLayout());

      t=new JTextField(6);
      add(t);
      b=new JButton("Display");
      add(b);
      b.addActionListener(this);

      setSize(400, 500);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

    public void actionPerformed(ActionEvent ae){
        new Thread(this).start(); //it auto call run mathod

    }
    public void run(){
        try{
        for(int i=1;i<=10;i++){
            t.setText(" "+i);       ///****************** */
            Thread.sleep(200);
        }
      }catch(Exception e){}
    }

    public static void main(String[] args) {
        new nodisplay();
    }
    
}
