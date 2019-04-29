package f_oop2;

public class Time {
	
	private final int MAX_HOUR = 24;
	private final int MAX_MINUTE = 60;
	private final int MAX_SECOND = 60;
	private final int MIN_HOUR = 0;
	private final int MIN_MINUTE = 0;
	private final int MIN_SECOND = 0;
	
	private int hour;
	private int minute;
	private int second;
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < MIN_SECOND){
			this.second = MIN_SECOND;
		}else{
			setMinute((this.second+second) / MAX_SECOND);
			this.second = (this.second+second) % MAX_SECOND;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < MIN_MINUTE){
			this.minute = MIN_MINUTE;
		}else{
			setHour((this.minute+minute) / MAX_MINUTE);
			this.minute = (this.minute+minute) % MAX_MINUTE;
		}
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < MIN_HOUR){
			this.hour = MIN_HOUR;
		}else{
			this.hour = ((this.hour+hour) % MAX_HOUR);
		}
	}
	
	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}