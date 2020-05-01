package exe02;
import java.util.Scanner;
public class Power 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double solution=1;
		System.out.println("Please type the base:\t");
		double base = sc.nextDouble();
		System.out.println("PLease type the exponent\t ");
		int exp =sc.nextInt();
		if (exp<0)
		{
			while(exp<0)
			{
				solution=(1/base)*solution;
				exp++;
			}
		}
		if (exp>0)
		{
			while(exp>0)
			{
				solution=base*solution;
				exp--;
			}
		}
		System.out.println("The solution is: "+solution);
		sc.close();
	}

}

