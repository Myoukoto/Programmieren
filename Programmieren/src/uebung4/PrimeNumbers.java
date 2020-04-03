package uebung4;
import java.util.Scanner;
public class PrimeNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in your number: ");
		int number=sc.nextInt();
		int divider=1;
		for(int i=2;divider<2;i++)
		{
			if (i==number)
			{
				divider++;
				System.out.println("The Number"+ i + " is a Prime Number " );
			}
			else
			{
				i++;
			}
		}
		sc.close();
	}
}
