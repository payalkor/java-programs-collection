package thread;

import java.awt.*;
import javax.swing.*;
public class temple extends JFrame{
    public temple(){
        setLayout(new FlowLayout());
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
     super.paint(g);
     g.setColor(Color.GRAY);
     g.fillRect(120,150,80,80);

     g.setColor(Color.ORANGE);
     int x[]={120,160,200};
     int y[]={150,100,150};
     g.fillPolygon(x,y,3);
     
    }
    public static void main(String[] args) {
        new temple();
    }
}
