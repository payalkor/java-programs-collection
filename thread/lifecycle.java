package thread;

import java.util.Random;
public class lifecycle extends Thread{
    String str;
    public lifecycle(String str){
    this.str=str;
    }
    public void run(){
        Random r=new Random();
        int time=r.nextInt(4999);
        try{
            System.out.println("Thread Name : "+str);
            Thread.sleep(time);
            System.out.println("Thread Sleep Time  : "+time);

        }catch(Exception e){}
    
    }      
    public static void main(String[] args) {
        lifecycle l=new lifecycle("threads 1");
         lifecycle l2=new lifecycle("threads 2");
        l.start();
        l2.start();
    }
    
}
