package Time;

public class Difference_Time {

	public Difference_Time(Time t1,Time t2,Time t) {
		int t1_hours = t1.getHours(),t1_minutes = t1.getMinutes(),t1_seconds = t1.getSeconds();
		int t2_hours = t2.getHours(),t2_minutes = t2.getMinutes(),t2_seconds = t2.getSeconds();
		
		int t1_total_time = t1_hours*3600 + t1_minutes * 60 + t1_seconds;
		int t2_total_time = t2_hours*3600 + t2_minutes * 60 + t2_seconds;
		System.out.println(t2_total_time);
		System.out.println(t1_total_time);
		
		int diff_time;
		
		diff_time =  t2_total_time-t1_total_time;
		
		if(diff_time<0) {
			diff_time += 24*3600;
		}
			
		System.out.println(diff_time);
		int hoursDifference = diff_time / 3600;
        int minutesDifference = (diff_time % 3600) / 60;
        int secondsDifference = diff_time % 60;
        
        t.setHoursDifference(hoursDifference);
        t.setSecondsDifference(secondsDifference);
        t.setMinutesDifference(minutesDifference);
	}
}
