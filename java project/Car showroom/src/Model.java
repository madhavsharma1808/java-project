/** This is an abstract class which can be extended by any Model class  */

abstract class Model
{
    String category;
    int product_no; 
    String name;
    String brand;
    double price;
    double discount;
    Model()
    {
        category=null;
        product_no=0;
        name=null;
        brand=null;
        price=0;
        discount=0;
    }
    Model(int p,String name,String brand,double price,double discount){

        this.price=price;
        this.name=name;
        this.product_no=p;
        this.discount=discount;
        this.brand=brand;
    }

    abstract void add( );
    abstract boolean searchInStock(int n,String purpose );
}