public class StudentAdvanceTicket extends Ticket {

    private double price;
    private String id;

    StudentAdvanceTicket(String id, int days){      // Constructor that takes the days purchased and assigns a price.
        this.id = id;
        if(days > 10 ){
            this.price = DEFALTPRICE *(0.3);       // 70% discount
        }
        else{
            this.price = DEFALTPRICE *(0.4);        //60% discount
        }
    }

    public double getPrice(){                          // Returns Price
        return price;
    }

    public void printInfo(){                        // Prints info.
        String info= "";
        info += "Ticket Type: Student Advanced, ";
        info += "Number: " + id;
        info += ", Price: " + price + "$ (ID required)";
        System.out.println(info);
    }



}
