
public class TicketClient {

    public static void main(String[] args) {


        Ticket a = new Ticket("17");
        System.out.println(a.getPrice());
        a.printInfo();

        WalkupTicket d = new WalkupTicket("17");              // This is one example of an instantiate calling the methods. More using different classes below
        System.out.println(d.getPrice());
        d.printInfo();

        AdvanceTicket j = new AdvanceTicket("17", 6);
        System.out.println(j.getPrice());
        j.printInfo();

        StudentAdvanceTicket g = new StudentAdvanceTicket("17", 7);
        System.out.println(g.getPrice());
        g.printInfo();

        Ticket b = new Ticket("20", 100);
        System.out.println(b.getPrice());
        b.printInfo();

        WalkupTicket f = new WalkupTicket("20");
        System.out.println(f.getPrice());
        f.printInfo();

        AdvanceTicket l = new AdvanceTicket("20", 19);
        System.out.println(l.getPrice());
        l.printInfo();

        StudentAdvanceTicket h = new StudentAdvanceTicket("20", 10);
        System.out.println(h.getPrice());
        h.printInfo();

        Ticket c = new Ticket("2", 75);
        System.out.println(c.getPrice());
        c.printInfo();

        WalkupTicket e = new WalkupTicket("2");
        System.out.println(e.getPrice());
        e.printInfo();

        AdvanceTicket k = new AdvanceTicket("2", 14);
        System.out.println(k.getPrice());
        k.printInfo();

        StudentAdvanceTicket i = new StudentAdvanceTicket("2", 12);
        System.out.println(i.getPrice());
        i.printInfo();
    }

}


