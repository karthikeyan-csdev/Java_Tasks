package bus_res;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		String name;
		int bno;
		String d;
		
		ArrayList<Buses> buses = new ArrayList<Buses>();
		ArrayList<Bookings> bookings = new ArrayList<Bookings>();
		
		buses.add(new Buses(1,true,1));
		buses.add(new Buses(2,false,2));
		buses.add(new Buses(3,false,3));
		buses.add(new Buses(4,true,4));
		/*
		 * bookings.add(new Bookings("kk1",1,"10-10-2022")); bookings.add(new
		 * Bookings("kk2",2,"11-10-2022")); bookings.add(new
		 * Bookings("kk3",3,"12-10-2022")); bookings.add(new
		 * Bookings("kk4",4,"13-10-2022"));
		 */
		/*
		 * for(Bookings b:bookings) { b.DisplayBookings(); }
		 */		
		Scanner sc = new Scanner(System.in);
		
		int loop=0;
		while(true) {
			System.out.println("                          KK Travels");
			System.out.println("                          -- -------");
			System.out.println("Enter Your Choice: \n 1. Book Ticket \n 2. Display Bookings \n 3. Check Available Seats \n 4. Exit");
			loop = sc.nextInt();
			
			
			switch (loop) {
			case 1: {
				for(Buses b : buses) {
					b.DisplayBuses();
				}
				System.out.println("Enter Passenger Name:");
				name=sc.next();
				System.out.println("Bus Number:");
				bno = sc.nextInt();
				System.out.println("Enter Date dd-mm-yyyy:");
				d = sc.next();
				Services service = new Services();
				if(service.isAvaliable(buses,bookings,bno,d)) {
					bookings.add(new Bookings(name, bno, d));
					System.out.println("Booked Success");
				}
				else {
					System.out.println("Not Booked");
				}	
				break;
			}
			case 2:{
				for(Bookings b:bookings) {
					b.DisplayBookings();
				}		
				break;
			}
			case 3:{
				System.out.println("Enter Date dd-mm-yyyy:");
				d = sc.next();
				Services service = new Services();
				service.Check_Available_Seats(buses,bookings,d);
				
				break;
			}
			case 4:{
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + loop);
			}
		}
	}

}
