package thread;

class PC{
    int val;
    boolean av=false;
    synchronized void producer(int va){
        
        try{
        while(av){
            wait();
        }
        val=va;
        System.out.println("Producer produce : "+val);
        av=true;
        notify();
       }catch(Exception e){ }
    }
    synchronized public void consumer(){
        try{
        while(!av){
            wait();
        }
        System.out.println("Consumer consume : "+val);
        av=false;
        notify();
    }catch(Exception e){}

    }


}
class Pro extends Thread{
    PC p;
    int i;
    Pro(PC p){
        this.p=p;
    }
    public void run(){
        for(i=1;i<=55;i++)
          p.producer(i);
    }

}
class Con extends Thread{
    PC p;
    Con(PC p){
        this.p=p;
    }
    public void run(){
        for(int i=0;i<5;i++)
          p.consumer();
    }

}
public class procon{
    public static void main(String[] args) {
        PC p=new PC();
        new Pro(p).start();
        new Con(p).start(); 
    }
}
