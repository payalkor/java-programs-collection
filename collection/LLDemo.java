package collection;
import java.util.*;
public class LLDemo {
    void add(LinkedList<String> ll,String nm){
       ll.addLast(nm);
       System.out.println("Name is added at the end of LinkedList");
    }
    void reverse(LinkedList<String> ll){
        System.out.println("Reverse Order is :");
        Iterator<String> it=ll.descendingIterator();
        while(it.hasNext()){                           //
            System.out.println(it.next());           //
        }
    }
    void rem(LinkedList<String> ll){
        if(!ll.isEmpty()){                      //
          ll.poll();
          System.out.println("Delete First Ele");
        }
        else
        System.out.println("LL is Empty");
    }
    public static void main(String arg[]){
        int ch;
        String nm;
        LLDemo de=new LLDemo();
        Scanner s=new Scanner(System.in);
        LinkedList<String> ll=new LinkedList<>();
        while(true){      //
        System.out.println("1.Add Ele at end \n2.Display the contents of list in reverse order \n3.Delete first element of the list \n4.Exit");
        System.out.println("Enter your choice:");
        ch=s.nextInt();
        s.nextLine();             //
        switch(ch){
            case 1:System.out.println("Enter Name");
                   nm=s.nextLine();
                   de.add(ll,nm);
                   break;
            case 2:de.reverse(ll);
                   break;
            case 3:de.rem(ll);
                   break;
            case 4:s.close();                       //
                   System.exit(0);
                   break;

        }
    }
    
   }
}
