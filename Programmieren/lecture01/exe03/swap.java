package exe03;

public class swap 
{
	public static void main(String[] args) 
	{
		int x = 5;
		int y =7;
		// before the swap
		System.out.println(x);
		System.out.println(y);
		
		//swap
		x=x+y;
		y=x-y;
		x=x-y;
		
		// after the swap
		System.out.println(x);
		System.out.println(y);
	}
}
