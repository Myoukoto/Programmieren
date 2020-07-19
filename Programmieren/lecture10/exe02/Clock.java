package exe02;

public class Clock 
{
 private int hour;
 private int minute;
 private int second;
 
 public Clock(int hour, int minute, int second)
 {
	 if (hour>=0 && hour<=24 && minute>=0 && minute<=60 && second>=0 && second<=60)
	 {
	 this.hour=hour;
	 this.minute=minute;
	 this.second=second;
	 }
	 else
	 {
		 this.hour=12;
		 this.minute=0;
		 this.second=0;
	 }
 }
 public int getHour() 
 {
	return hour; 
 }
 public int getMinute()
 {
 		return minute;
 }
 public int getSecond()
 {
	 return second;
 }
 public void setClock(int hour,int minute,int second) 
 {
	 if (hour>=0 && hour<=24 && minute>=0 && minute<=60 && second>=0 && second<=60)
	 {
	 this.hour=hour;
	 this.minute=minute;
	 this.second=second;
	 }
	 else
	 {
		 System.out.println("Error - invalid Time ");
	 }
 }
 public void nextSecond()
 {
	 if (second<60)
	 {
	 second++;
	 }
	 else {
		 second=0;
		 minute++;
	 }
	 
 }
}
