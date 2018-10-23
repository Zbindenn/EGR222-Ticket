public class AdvanceTicket extends Ticket {
    private double price;
    private String id;


    AdvanceTicket(String id, int days){                 // Constructor takes an int days and returns a price.
        this.id = id;
        if(days > 10 ){
        this.price = DEFALTPRICE * (0.6);               // 40% Discount
        }
        else{
            this.price = DEFALTPRICE*(0.8);              // 20% Discount
        }
    }

    public double getPrice(){
        return price;
    }

    public void printInfo(){
        String info= "";
        info += "Ticket Type: Advanced, ";
        info += "Number: " + id;
        info += ", Price: " + price +"$";
        System.out.println(info);
    }
}
