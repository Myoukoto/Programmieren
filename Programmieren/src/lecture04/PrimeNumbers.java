package lecture04;
import java.util.Scanner;
public class PrimeNumbers 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number=sc.nextInt();
		int divider=1;
		for(int i=2;divider<2;i++)
		{
			if (i==number)
			{
				divider++;
				System.out.println("The Number"+ number + " is a Prime Number " );
			}
			else if(number%i==0)
			{
				divider++;
				System.out.println("The Number"+ number + " is not a Prime Number " );
			}
		}
		sc.close();
	}
}
