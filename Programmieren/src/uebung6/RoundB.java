package uebung6;
import java.util.Scanner;
public class RoundB 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the number which you like to be rounded: ");
		double number =sc.nextDouble();
		System.out.println("On how many decimal places do you want it to be rounded?: ");
		int decimals=sc.nextInt();
		double decimalsave=Math.pow(10, decimals);
		number=number*decimalsave;
		if(number%10 >=5)
		{
			number=(int)(number+1)/decimalsave;
			System.out.println("The Rounded result is: "+number);
		}
		else
		{
			number=(int)number/decimalsave;
			System.out.println("The Rounded result is: "+number);
		}
		System.out.println(number);
		sc.close();
	}
}
