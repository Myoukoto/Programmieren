package uebung3;
import java.util.Scanner;
public class NumberTest 
{
	public static void main (String[] arsg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in your Student ID");
		int number = sc.nextInt();
		if (number/100000 ==51 || number/100000 ==50 || number/100000 ==61)
		{
			System.out.println("Your ID " + number + " is valid");
		}
		else 
		{
				System.out.println("Your ID is not valid");
		}
		sc.close();
	}
}
