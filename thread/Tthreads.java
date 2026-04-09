package thread;

import java.util.Random;
class Thread1 extends Thread{
    public void run(){
        Random r=new Random();
        try{
        while(true){
            
            int n=r.nextInt(100);
            if(n%2==0){
                new Thread2(n).start();
            }
            else{
                new Thread3(n).start();
            }
            Thread.sleep(1000);
        }

      }catch(Exception e){}
    }
}
class Thread2 extends Thread{
    int n;
    public Thread2(int n){
        this.n=n;
    }
    public void run(){
        System.out.println(n+" square is : "+(n*n));
    }
}
class Thread3 extends Thread{
    int n;
    public Thread3(int n){
        this.n=n;
    }
    public void run(){
        System.out.println(n+" cube is : "+(n*n*n));
    }
}

public class Tthreads{   
    public static void main(String[] args) {
        Thread1 t=new Thread1();
        t.start();
        
    }
    
}
