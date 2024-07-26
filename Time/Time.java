package Time;

public class Time {
	private int Hours,Minutes,Seconds;
	
	Time(int hours,int minutes,int seconds){
		this.Seconds = seconds;
		this.Hours = hours;
		this.Minutes = minutes;
	}
	Time(){
		
	}
	
	int hoursDifference ,minutesDifference,secondsDifference; 

	public int getHoursDifference() {
		return hoursDifference;
	}

	public void setHoursDifference(int hoursDifference) {
		this.hoursDifference = hoursDifference;
	}

	public int getMinutesDifference() {
		return minutesDifference;
	}

	public void setMinutesDifference(int minutesDifference) {
		this.minutesDifference = minutesDifference;
	}

	public int getSecondsDifference() {
		return secondsDifference;
	}

	public void setSecondsDifference(int secondsDifference) {
		this.secondsDifference = secondsDifference;
	}

	public int getHours() {
		return Hours;
	}

	public void setHours(int hours) {
		Hours = hours;
	}

	public int getMinutes() {
		return Minutes;
	}

	public void setMinutes(int minutes) {
		Minutes = minutes;
	}

	public int getSeconds() {
		return Seconds;
	}

	public void setSeconds(int seconds) {
		Seconds = seconds;
	}

	@Override
	public String toString() {
		return "Time [Hours=" + Hours + ", Minutes=" + Minutes + ", Seconds=" + Seconds + "]";
	}
	
	
}
