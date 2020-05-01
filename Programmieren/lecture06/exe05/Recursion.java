package exe05;
import java.util.Scanner;
public class Recursion 
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the base:\t");
		double base =sc.nextDouble();
		System.out.println("Please enter the exponent:\t");
		int exponent=sc.nextInt();
		System.out.println(power(base,exponent));
		sc.close();
	}
	public static double power(double base,int expo)
	{
		if (expo==0) 
		{
			return 1;
		}
		return base*power(base,expo-1);
		
	}
}
