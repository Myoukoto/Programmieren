package uebung4;
import java.util.Scanner;
public class FreeFall 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//G for gravitation
		final double G =9.80655;
		System.out.println("Type in the lenghth if the fall in seconds: ");
		int sec =sc.nextInt();
		int i=1; // for exercise a it's 0
		while(sec>=0)
		{
		System.out.println("Time: " + i + "seconds: distance covered: "+0.5*G*Math.pow(i, 2)+"m");
		sec=sec-5; // for a) sec-- i++
		i=i+5;
		}		
		sc.close();
	}
}
