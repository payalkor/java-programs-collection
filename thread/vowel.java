package thread;

import java.util.Scanner;
public class vowel extends Thread{
    String str;
    public vowel(String str){
     this.str=str;
    }
    public void run(){
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u'){
                try{
                    System.out.println(c);
                    Thread.sleep(3000);

                }catch(Exception e){}
            }
        }
    }
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter String");
     String str=s.next();
     vowel v=new vowel(str);
     v.start();  
     s.close();  
    }
    
}
