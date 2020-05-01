package exe03;
import java.util.Scanner;
public class SingleCharacter 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//user input
		System.out.print("Please type in your char:") ;
		String line =sc.nextLine();
		char c =line.charAt(0);
		
		//if statements to determine what c can potentially be
		if(c==48 || c==49)
		{
				System.out.println("Binary digit");
		}
		if(c>=48 && c<=55) 
		{
			System.out.println("Octal digit");
		}
		if (c>=48 && c<=57)
		{
			System.out.println("Decimal digit");
		}
		if(c>=48 && c<=57 || c>=65 && c<=70 || c>=97 && c<=102)
		{
			System.out.println("Hexadecimal digit");
		}
		if(c>=65 && c<=90)
		{
			System.out.println("Capital letter");
		}
		// Exclusion of all signs that are not included in the question
		if(c<48 || c>57 && c<65 ||  c>90 && c<97 || c>102)
		{
			System.out.println("Unknown sign");
		}
		sc.close();
	}
}
