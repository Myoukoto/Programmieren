package lecture02;
import java.time.LocalTime;
public class ClockA 
{
	public static void main(String[] args)
	{
		//manual init of variables
		
		int sec = 34;
		int min = 48;
		int h = 1;
		int day=60*60*24;
		int bygone =sec+min*60+h*3600;
		//implementation of the exercise 
		
		System.out.println("Seconds past midnight:"+bygone);
		System.out.println("Seconds until midnight: " + (day-bygone));
		System.out.println(((double)bygone/day)*100 +" % of the day has past");
		
		//d extra exercise with LocalTime Methods
		
		LocalTime s =LocalTime.now();
		sec=s.getSecond();
		min=s.getMinute();
		h=s.getHour();
		
		bygone =sec+min*60+h*3600;
		System.out.println("Seconds past midnight:"+bygone);
		System.out.println("Seconds until midnight: " + (day-bygone));
		System.out.println(((double)bygone/day)*100 +" % of the day has past");
		
	}
}
