package thread;


public class covid extends Thread {
    String s;
    int n;
    public covid(String s,int n){
        this.s=s;
        this.n=n;
    }
    public void run(){
        for(int i=0;i<n;i++)
        System.out.println(s);

    }
    public static void main(String[] args) {
        covid t1=new covid("payal",2);
        covid t2=new covid("prabhavati",3);
        covid t3=new covid("disha",2);
        
        t1.start();
        t2.start();
        t3.start();
        
    }
    
}
