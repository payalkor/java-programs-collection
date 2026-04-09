package thread;

import javax.swing.*;

public class blinktext extends JFrame implements Runnable{
    JLabel l;
    Thread t;
    public blinktext(){

        l=new JLabel("Hello,this is PAYAL",JLabel.CENTER);
        add(l);
        setTitle("Blink text using runnable interface");
        setSize(400,400);      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        t=new Thread(this);
        t.start();
    }
    public void run(){
        try{
            while(true){
                l.setVisible(false);
                Thread.sleep(500);
                l.setVisible(true);
                Thread.sleep(500);
            }

        }catch(Exception e){}
    }
    public static void main(String[] args) {
        new blinktext();
    }
    
}
