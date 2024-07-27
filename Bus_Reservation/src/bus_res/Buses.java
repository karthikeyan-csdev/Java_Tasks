package bus_res;

public class Buses {
	
	private int busno;
	private boolean ac;
	private int capacity;
	
	Buses(int bno,boolean a,int cap){
		this.busno=bno;
		this.ac=a;
		this.capacity=cap;
	}
	
	
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void DisplayBuses() {
		System.out.println( "BusNumber = " + busno + ", A/C = " + ac + ", Capacity = " + capacity);
	}
	
	

}
