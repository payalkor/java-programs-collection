package thread;
import javax.swing.*;
import java.awt.*;
public class india extends JFrame implements Runnable {
    india(){
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        new Thread(this).start();
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.ORANGE);
        g.fillRect(100,120,140,40);
         g.setColor(Color.WHITE);
        g.fillRect(100,140,140,40);
         g.setColor(Color.GREEN);
        g.fillRect(100,180,140,40);
        g.setColor(Color.BLUE);
        g.drawOval(100,140,140,40);

    }
    public void run(){
        try{
            repaint();
            
            Thread.sleep(100);

        }catch(Exception e){  }

    }
    public static void main(String[] args) {
        new india();
        
    }
    
}
