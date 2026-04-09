package collection;
import java.util.*;

public class STDcode {
    public static void main(String arg[]){
        int ch,code;
        String nm;

        HashMap<String,Integer> hm=new HashMap<>();
        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("************************************");
            System.out.println("\n1.Add city and code \n2.Remove city \n3.Search city name and disp std code \n4.exit");
            System.out.println("Enter your choice :");
            ch=s.nextInt();
            s.nextLine();

            switch(ch){

                case 1:System.out.println("Enter City Name :");
                        nm=s.nextLine();
                       if(hm.containsKey(nm)){
                          System.out.println("Already Exists!");
                       }
                       else{
                          System.out.println("Enter STD Code :");
                          code=s.nextInt();
                          hm.put(nm,code);
                          System.out.println(" City Name Added:");
                       }
                       break;

                case 2:System.out.println("Enter City Name to be delete:");
                       nm=s.nextLine();
                       if(hm.remove(nm)!=null){           //it return value
                         System.out.println("Remove City name:");
                       }
                       else{
                        System.out.println("City Name not found");
                       }
                       break;

                case 3:System.out.println("Enter City Name to search :");
                       nm=s.nextLine();
                       if(hm.containsKey(nm)){
                        System.out.println("STD code is  :"+hm.get(nm));
                       }
                       else
                        System.out.println("Not Found!:");
                       break;
                       
                case 4:System.out.println("THANK YOU");
                       s.close();
                       System.exit(0);
                       break;
            }
        }
    }
}
