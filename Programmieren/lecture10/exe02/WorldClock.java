package exe02;

public class WorldClock
{
	public static void main(String[]args)
	{
		Clock[] WorldClock= new Clock[24];
		for(int i=0;i<24;i++) 
		{
			WorldClock[i]=new Clock(i,23,07);
		}
		System.out.println(WorldClock[5].getSecond());
		for(int i=0;i<24;i++) 
		{
			WorldClock[i].nextSecond();
		}
		
		System.out.println(WorldClock[5].getSecond());
		
	}
}
