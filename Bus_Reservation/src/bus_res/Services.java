package bus_res;

import java.util.ArrayList;

public class Services {
public boolean isAvaliable(ArrayList<Buses> b,ArrayList<Bookings> book,int bno,String d) {
		int capacity=0;
		for(Buses bus:b) {
			if(bus.getBusno()==bno) {
				capacity = bus.getCapacity();
			}
		}
		
		int booked=0;
		
		for(Bookings bo:book) {
			if(bo.getBusno() == bno && bo.getDate().equals(d)) {
				booked ++;
			}
			System.out.println(booked+"");
		}
		return booked<capacity;
	}
public void Check_Available_Seats(ArrayList<Buses> bus,ArrayList<Bookings> bo,String d) {
		
	System.out.println("BUS NO  -  Seats Available");
	int capacity=0;
	int booked=0;
	
	for(Buses b:bus) {
		capacity = b.getCapacity();
		
		for(Bookings book:bo) {
			if(book.getBusno() == b.getBusno() && book.getDate().equals(d)) {
				booked ++;
			}
			System.out.println("   "+b.getBusno()+"  -       "+(b.getCapacity()-booked));
		}
	}
		//System.out.println("   "+b.getBusno()+"  -       "+b.getCapacity());
	}
}
