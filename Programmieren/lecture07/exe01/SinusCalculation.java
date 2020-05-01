package exe01;
import java.util.Scanner;
public class SinusCalculation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		double number=sc.nextDouble();
		System.out.println("The sinus equals:"+sin(number));
		sc.close();
	}
	public static double sin(double x) 
	{
		double numerator= x;
		double denominator= 1.0;
		double sum = x;
		double summand=1;
		for (int i = 3; summand > 1E-15 || summand < -1E-15; i = i + 2)
		{
			numerator=numerator*x*x*(-1);
			denominator=denominator*i*(i-1);
			summand=(numerator/denominator);
			sum=sum+summand;
		}
		return sum;
	}
}
