package exe01;
import java.util.Scanner;
public class RoundA 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the number which you like to be rounded");
		double number =sc.nextDouble();
		// Since we don't want decimal places as a result the typcast to int deletes them comfortably  
		if((number*10)%10 >=5)
		{
			System.out.println("The Rounded result is: "+((int)number+1));
		}
		else
		{
			System.out.println("The Rounded result is: "+(int)number);
		}
		sc.close();
	}
}
