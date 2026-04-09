package thread;

import javax.swing.*;
import java.awt.*;
public class signal extends JFrame implements Runnable {
    Thread t;
    int s=0;
      public signal(){
        setSize(300,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        t=new Thread(this);
        t.start();
      }
    public void paint(Graphics g){
        super.paint(g);

         g.setColor(s==0?Color.RED:Color.GRAY);
         g.fillOval(80,100,40,50);//y imp

         g.setColor(s==1?Color.YELLOW:Color.GRAY);
         g.fillOval(80,170,40,50);

        g.setColor(s==2?Color.GREEN:Color.GRAY);
        g.fillOval(80,240,40,50);

    }
    public void run(){
        try{
         while(true){
           s=0; //red
           repaint();
           Thread.sleep(1000);
           s=1;  //green
           repaint();
           Thread.sleep(1500);
           s=2;  //yellow
           repaint();
           Thread.sleep(1000);
         }

        }catch(Exception e){}
    }
    public static void main(String[] args) {
        new signal();
    }
}
