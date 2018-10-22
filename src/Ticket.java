public class Ticket {
   private int price;
   private String id;


    Ticket(){
        this.price = 50;
        this.id = "Empty";
    }

    Ticket(String id){
        this.price = 50;
        this.id = id;
    }

    Ticket(String id, int price){
        this.id = id;
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void printInfo(){
        String info= "";
        double d = (double) price;
        info += "Number: " + id;
        info += ", Price: " + d + "$";
        System.out.println(info);
    }



}
