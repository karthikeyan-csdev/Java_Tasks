package bus_res;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bookings {
	
	private String PassengerName;
	private int busno;
	private String date;

	public Bookings() {
		
	}
	
	public Bookings(String name,int bno,String d) throws ParseException {
		this.PassengerName = name;
		this.busno=bno;
		this.date=d;

	}
	
	public String getPassengerName() {
		return PassengerName;
	}
	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public void DisplayBookings() {
		System.out.println("Bookings [PassengerName=" + PassengerName + ", busno=" + busno + ", date=" + date + "]");
	}
	
}
