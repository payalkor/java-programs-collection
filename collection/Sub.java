package collection;
import java.util.*;

public class Sub {
    public static void main(String[] args) {
        int i,n;
        
        Scanner s=new Scanner(System.in);
        LinkedList<String> ll=new LinkedList<>();

        System.out.println("Enter size :");
        n=s.nextInt();

        s.nextLine();           

        System.out.println("Enter "+n+" Subjects:");
        for(i=0;i<n;i++){
            ll.add(s.nextLine());
        }
        System.out.println("Sujects added Successfully!");

        Iterator<String> it=ll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        s.close();
    }
    
}
