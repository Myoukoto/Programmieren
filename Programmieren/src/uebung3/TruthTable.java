package uebung3;
import java.util.Scanner;
public class TruthTable 
{
	//truth table with the results as asked in the exercise ff=0 ft=1 tf=2 tt=3
	 	 
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Type in two letters without using space between them. Only use the letters t and f.\nt stands for  true and f for false:\n");
		String	letter = sc.nextLine();
		char l1 = letter.charAt(0);
		char l2 = letter.charAt(1);
		if (l1=='f'&& l2=='f')
		{
			System.out.println("The result is 0");
		}
		else if(l1=='f'&& l2=='t')
		{
			System.out.println("The result is 1");
		}
		else if (l1=='t'&& l2=='f')
		{
			System.out.println("The result is 2");
		}
		else if (l1=='t'&& l2=='t')
		{
			System.out.println("The result is 3");
		}
		else
		{
			System.out.println("Wrong input");
		}
		sc.close();
	}
}
