package movieTicket;


public class MovieTicket {
	static int tprice;
	static int tcount;
	static String movieName="WAR";
	static {
		tprice=200;
	}
	static {
		tcount=50;
	}
	

	
	 
	
	void bookTicket(int ticket) throws InvalidMovieSelectionException,TicketsSoldOutException {
		 if (ticket <= 0) {
	            throw new InvalidMovieSelectionException();
	        }else {
	        	System.out.println("valid ticket number.");
	        }
		if(ticket>tcount) {
			throw new TicketsSoldOutException();
		}else {
			System.out.println("Ticket AVAILABLE");
		}
		tcount = tcount - ticket;
		
	}
	
	
}
