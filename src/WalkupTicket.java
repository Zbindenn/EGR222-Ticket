
public class WalkupTicket extends Ticket {

    private int price;
    private String id;


   WalkupTicket(String id){
        this.price = 50;
        this.id = id;
    }


    public void printInfo(){
        String info= "";
        double d = (double) price;
        info += "Ticket Type: Walk-up, ";
        info += "Number: " + id;
        info += ", Price: " + d + "$";
        System.out.println(info);
    }




}
