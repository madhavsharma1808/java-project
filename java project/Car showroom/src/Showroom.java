
import java.util.*;
public class Showroom implements Runnable{

  public  void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("=====================================================================================================================================================");
        System.out.println(" \t\t\t------------ Welcome to THE CAR SHOWROOM-------------");
        System.out.println("=====================================================================================================================================================");
        System.out.println("Are you a customer YES/NO");
        String cus=sc.next();
        while(true)
        {
            switch(cus)
            {
                case "YES" :Customer obj = new Customer();
                        System.out.println("Car\nBike");
                       String ch=sc.next();
                      
                        obj.show(ch);
                     break;
                case "NO": Owner obj1;
                System.out.println("Do you Want to Add or Remove");
                    ch=sc.next();
                    if(ch.equals("Add"))
                    {
                        System.out.println("Fill Car details below:");
                        System.out.println("Enter category :\nc-car \nb-bike");
                        char cat=sc.next().charAt(0);
                        System.out.println("Enter model number");
                        int p=sc.nextInt();
                        System.out.println("Enter model name");
                        String name=sc.next();
                        System.out.println("Enter model brand");
                        String brand = sc.next();
                        System.out.println("Enter model price");
                        double price = sc.nextDouble();
                        System.out.println("Enter model discount");
                        double dis=sc.nextDouble();
                    obj1 = new Owner("add",cat,p,name,brand,price,dis);
                    }
                    else if(ch.equals("Remove"))
                    {
                        System.out.println("Enter category ");
                        char cat=sc.next().charAt(0);
                        obj1 = new Owner("remove",cat,324324,"adadd","Sdfd",234,24);
                    }
                    break;
                    default:System.out.println("Wrong choice");
            }
            System.out.println("Do you want to exit the show room ? YES / NO");
            if(sc.next().equals("YES"))
            break ;
        }

      l1:  System.out.println("Thank You , Visit Again");

    }
    
}