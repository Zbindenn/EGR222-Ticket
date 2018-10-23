public class Ticket {                       // Basic class that has three different constructors.

   public static final double DEFALTPRICE= 50;
   private double price;
   private String id;


    Ticket(){
        this.price = DEFALTPRICE;
        this.id = "Empty";
    }

    Ticket(String id){
        this.price = DEFALTPRICE;
        this.id = id;
    }

    Ticket(String id, int price){
        this.id = id;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void printInfo(){                        //Prints the info of the class.
        String info= "";
        info += "Number: " + id;
        info += ", Price: " + price + "$";
        System.out.println(info);
    }



}
