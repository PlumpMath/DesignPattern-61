package singleton.A1;


public class Main {

	public static void main(String[] args) {
		TicketMaker ticketMaker1 = TicketMaker.getInstance();
		TicketMaker ticketMaker2 = TicketMaker.getInstance();

		ticketMaker1.getNextTicketNumber();
		ticketMaker2.getNextTicketNumber();

		System.out.println("ticket = " + ticketMaker1.getNextTicketNumber());


	}

}
