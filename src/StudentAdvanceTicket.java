public class StudentAdvanceTicket extends Ticket {

    private int price;
    private String id;
    private int days;


    StudentAdvanceTicket(String id, int days){
        this.id = id;
        this.days = days;

    }


    public int getPrice(){
        if(days > 10 ){
           this.price = 15;
        }
        else{
            this.price = 20;
        }
        return price;
    }

    public void printInfo(){
        String info= "";
        double d = (double) price;
        info += "Ticket Type: Student Advanced, ";
        info += "Number: " + id;
        info += ", Price: " + d + "$ (ID required)";
        System.out.println(info);
    }



}
