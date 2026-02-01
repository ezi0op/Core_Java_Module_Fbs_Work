package movieTicket;

import java.util.Scanner;

public class TicketBook {

	public static void main(String[] args) {
		MovieTicket m= new MovieTicket();
		
		Scanner sc = new Scanner(System.in);
		
		while(MovieTicket.tcount>0) {
			System.out.println("---------Movie Booking---------");
			System.out.println("Movie : WAR "+MovieTicket.movieName);
			System.out.println("Remaining Tickets :"+MovieTicket.tcount);
			System.out.println("Enter Number of tickets :");
			int t = sc.nextInt();
			
		try {
			m.bookTicket(t);
		}catch(InvalidMovieSelectionException e) {
			System.out.println(e);
		}catch(TicketsSoldOutException e ) {
			System.out.println(e);
			break;
		}
		
		
		}
		System.out.println("Ticket Sold out");
		sc.close();
	}

}
