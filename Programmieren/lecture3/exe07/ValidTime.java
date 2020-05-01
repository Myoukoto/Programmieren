package exe07;
import java.util.Scanner;

public class ValidTime 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in the current amount of hours passed");
		int hour = sc.nextInt();
		System.out.println("Please type in the current amount of minutes passed");
		int minute = sc.nextInt();
		System.out.println("Please type in the current amount of seconds passed");
		int second = sc.nextInt();
		boolean valid=minute>=0 && minute<=60 && second >=0 && second<= 60 && hour >=0 && hour<=24;
		if(valid)
		{
			System.out.println("Valid Time");
		}
		else
		{
			System.out.println("Invalid Time");
		}
		sc.close();		
	}
}
