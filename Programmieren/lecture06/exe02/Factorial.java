package exe02;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive Number");
		int number = sc.nextInt();
		System.out.println("The faculty of "+number+" equals "+fac(number));
		sc.close();
	}
	public static long fac(int x)
	{
		long result=1;
		for (int i=x;i>0;i--)
		{
				result=result*i;
		}
		
		return result;
	}
}
