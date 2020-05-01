package exe05;
import java.util.Scanner;
public class MultiplicativeDigitalRoot 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean validNumber=false;
		int number=1;
		int product=1;
		while(!validNumber)
		{
			System.out.print("Please type a number between 1 and a 1000000: ");
			number=sc.nextInt();
			int helpNumber = number;
			if (number>=0 && number<=1000000)
			{
				while (helpNumber != 0)
				{
					product=product*(helpNumber%10);
					helpNumber=helpNumber/10;
				}
			System.out.println("The Multiplicative digital root of "+number+" equals " + product);
			validNumber=true;
			}
			else
			{
				System.out.println("ERROR-Number is not valid");
			}
		}
		sc.close();
	}
}
