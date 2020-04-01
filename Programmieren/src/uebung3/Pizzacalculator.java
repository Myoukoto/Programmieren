package uebung3;
import java.util.Scanner;
public class Pizzacalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//asking for user input
		
		System.out.println("Please type in the Diameter of Pizza 1: ");
		int d1 = sc.nextInt();
		System.out.println("Please type in the Diameter of Pizza 2: ");
		int d2=sc.nextInt();
		System.out.println("Please type in the Price of Pizza 1: ");
		double p1 = sc.nextInt();
		System.out.println("Please type in the Price of Pizza 2: ");
		double p2 = sc.nextInt();
		
		//calculation of the areas of the pizzas and its cost-effectivensess
		
		double area1=(Math.PI*d1*d1)/4;
		double area2=(Math.PI*d2*d2)/4;
		double peff1=area1/p1;
		double peff2=area2/p2;
		
		//if statements
		
		if (peff1 > peff2 )
		{
			System.out.println("Pizza 1 is cheaper than pizza 2");
		}
		else if(peff1 ==peff2)
		{
			System.out.println(" Both pizzas will get you the same amount of pizza for your buck.");
		}
		else
		{
			System.out.println("Pizza 2 is cheaper than pizza1.");
		}
		
	sc.close();	
	}
}
