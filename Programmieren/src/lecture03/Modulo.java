package lecture03;
import java.util.Scanner;
public class Modulo 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type in the numer to check:");
		int x =sc.nextInt();
		if (x%7 == 0)
		{
			System.out.println("Number is divisable with 7");
		}
		else
		{
			System.out.println("Number is not divisable with 7");
		}
		sc.close();
	}
	
	/* Questions answered from b)
	 * 1. if Modulo Operator is used on negative numbers the value is negative.
	 * 2. if Modulo Operator is used for decimal numbers the value is the normal Integer + the decimals
	 * -->Both uses make sense in some cases
	 */
	
}
