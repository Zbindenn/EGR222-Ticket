
public class TicketClient {


    public static void main(String[] args) {


        Ticket a = new Ticket("7");
        System.out.println(a.getPrice());
        a.printInfo();

        Ticket b = new Ticket("14", 100);
        System.out.println(b.getPrice());
        b.printInfo();

        Ticket c = new Ticket("2", 75);
        System.out.println(c.getPrice());
        c.printInfo();

        WalkupTicket d = new WalkupTicket("12");              // This is one example of an instantiate calling the methods. More need to be made
        System.out.println(d.getPrice());
        d.printInfo();

        StudentAdvanceTicket e = new StudentAdvanceTicket("4", 7);      // Make more of these changing the numbers......
        System.out.println(e.getPrice());
        e.printInfo();

    }

}


