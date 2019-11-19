import java.util.Scanner;

/** This is an owner class which provide the functionality to add new model of car or bike or remove them through owner of the store */

class Owner {
    Owner(){
 
    }

    Owner(String  ch,char c,int p,String name,String brand,double price,double discount)
    {
        if(ch=="add")
        {
            if (c=='c')
            {
                Car obj = new Car(p,name,brand,price,discount);
                obj.add();
            }
            else if(c=='b')
            {
                Bike obj = new Bike(p,name,brand,price,discount);
                obj.add();
            }
        }
        if(ch == "remove")
        {
            Scanner sc=new Scanner(System.in);
            if(c == 'c')
            {
                System.out.println("Enter the model number");
                int n=sc.nextInt();
                Car obj = new Car();
                obj.remove(n);
            }
            else if(c=='b')
            {
                System.out.println("Enter the model number");
                int n=sc.nextInt();
                Bike obj = new Bike(p,name,brand,price,discount);
                obj.remove(n);
            }
        }
      
    }

	
}