
public class WalkupTicket extends Ticket {

    private double price;
    private String id;


   WalkupTicket(String id){     // New Constructor.
        this.price = DEFALTPRICE;
        this.id = id;
    }


    public void printInfo(){    // Prints Class info.
        String info= "";
        info += "Ticket Type: Walk-up, ";
        info += "Number: " + id;
        info += ", Price: " + price + "$";
        System.out.println(info);
    }




}
