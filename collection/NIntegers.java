package collection;
import java.util.*;

public class NIntegers {
    public static void main(String arg[]){
    int i,n,key;
    Scanner s=new Scanner(System.in);
    TreeSet<Integer> t=new TreeSet<>();

    System.out.println("Enter size of integers :");
    n=s.nextInt();
    System.out.println("Enter "+n+" Elements :");
    for(i=0;i<n;i++){
        t.add(s.nextInt());
    }
    System.out.println("Elemts added Successfully!");

    System.out.println("Elemts in sorted order:"+t);

    System.out.println("Enter Elemts to be search:");
    key=s.nextInt();
    if(t.contains(key)){
          System.out.println(key+" is found");
    }
    else
         System.out.println(key+" is not found");
       
    s.close(); 
   }
}

