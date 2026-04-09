package collection;
import java.util.*;
public class Frend {
    public static void main(String[] args) {
        int i,n;
        Scanner s=new Scanner(System.in);
        HashSet<String> h=new HashSet<>();
        System.out.println("Enter no of frineds name you want to enter:");
        n=s.nextInt();
        s.nextLine();
        System.out.println("Enter "+n+" name of friends");
        for(i=0;i<n;i++){
            h.add(s.nextLine());
           // System.out.println(h);
        }

        TreeSet<String> t=new TreeSet<>(h);
        for(String ne:t){
           System.out.println(ne);
        }

        s.close();

    }
   
    
}
