package thread;


public class atoz extends Thread {
    public void run(){
        try{
        for(char c='A';c<='Z';c++){
            System.out.println(c);
            Thread.sleep(2000);
            }
           }catch(Exception e){}
         }
    public static void main(String[] args) {
        atoz t=new atoz();
        t.start();
        
    }
    
}
