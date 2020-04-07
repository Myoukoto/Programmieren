package uebung6;
import java.util.Scanner;
public class Triangle 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the amount of lines from your Triangle:\t");
		int lines =sc.nextInt();
		stars(lines);
		sc.close();
	}
	public static void stars(int lines)
	{
		for(int i=1;i<=lines;i++)
		{
			for(int k=lines; k>=i;k--)
			{
			System.out.print(" ");
			}
			for(int j=1; j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}
