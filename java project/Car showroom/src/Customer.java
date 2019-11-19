/** THis is a customer class which displays the model to Customer and allow them to buy any of the model */

import java.io.*;
import java.util.*;

class Customer
{
    File f=null;
    void show(String category) 
    {
        if(category.equalsIgnoreCase("Car") )
        {  f= new File("car.txt");

    }
    else if(category.equalsIgnoreCase("Bike"))
    {
     f= new File("bike.txt");
    }
            try{
               
                Scanner sc=new Scanner(f);
                int i=0;
                System.out.println("*************a************");
                while(sc.hasNextLine())
                {
                    String temp=sc.nextLine();
                    temp.trim();
                    temp=temp+" ";
                   
                    String pno=temp.substring(i,temp.indexOf(" "));
                    System.out.println("Model-number: "+pno);
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Brand: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Name: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Price: "+temp.substring(i,temp.indexOf(" ")));
                    temp=temp.substring(temp.indexOf(" ")+1);
                    System.out.println("Discount: "+temp.substring(i,temp.indexOf(" ")));
                    System.out.println("*************************");
                }
               
                sc.close();
                }
               
                catch(IOException e)
                {
                    System.out.println(e);
                }
                Scanner sc=new Scanner(System.in);
                System.out.println("Do you want to buy any ? YES/NO");
                if(sc.next().equals("YES"))
                {
                    System.out.println("Enter the product number");
                    int prod_no=sc.nextInt();
                    select(prod_no,category);
                }
                
            
    
            }
           
      static  void select(int prod_no,String category){
          if(category.equalsIgnoreCase("Watches"))
          {
                Car obj= new Car();
                obj.remove(prod_no);
          }
         else if(category.equalsIgnoreCase("Bags"))
         {
                Bike obj1=new Bike();
                obj1.remove(prod_no);
         }
          
          

        }
    }
