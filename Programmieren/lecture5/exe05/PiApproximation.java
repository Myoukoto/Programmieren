package exe05;
import java.util.Scanner;
public class PiApproximation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type the number of rectangles you want to use to approximate pi: ");
		double n=sc.nextInt();
		double pi =0;
		double r = 1;
		for(int i=0;i<n;i++) 
		{
			pi=pi+4*r/n*(Math.sqrt((r*r)-((i/n)*(i/n))));	
		}
		System.out.println("Pi equals: "+ pi);
		sc.close();
	}
}
