package exe03;
import java.util.Scanner;
public class InCapitalLetters 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your words to be changed:");
		String words=sc.nextLine();
		System.out.println(inCapitalLetters(words));
		sc.close();
	}
	public static String inCapitalLetters(String words)
	{
		char[] change=words.toCharArray();
		for(int i=1;i<=words.length();i++)
		{
			if(change[i-1]>='a' && change[i-1]<='z')
			{
				change[i-1]=(char) (change[i-1]-32);
			}
		}
		String changed =String.valueOf(change);
		return  changed;
	}
}
