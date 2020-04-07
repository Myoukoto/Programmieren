package uebung6;
import java.util.Scanner;
public class PrimeNumberRefactoring {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int number=sc.nextInt();
		System.out.println(prime(number));		
		sc.close();
	}
	public static boolean prime(int number)
	{
			boolean prime = false;
			int divider=1;
			for(int i=2;divider<2;i++)
			{
				if (i==number)
				{
					divider++;
					prime=true;
				}
				else if(number%i==0)
				{
					divider++;
					break;
				}
			}
			return prime;
	}
}


