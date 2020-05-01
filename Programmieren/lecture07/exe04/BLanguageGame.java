package exe04;
import java.util.Scanner;
public class BLanguageGame 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your sentence to get translated in B-Language");
		String s =sc.nextLine();
		bLanguage(s);
		sc.close();
	}
	public static void bLanguage(String s)
	{
		String st;
		int counter =0;
		int i =0;
		char[] old =s.toCharArray();
		boolean vocal;
		// determination of the new length of the String
		while (i<old.length)
		{
			vocal = old[i] =='a' || old[i] =='e' || old[i] =='i' || old[i] =='o' || old[i] =='u';
			if (vocal)
			{
				counter=counter+2;
			}
			i++;
		}
		char[] newchars=new char[old.length+counter];
		int j=0;
		//implementation of the new letters
		for (int k =0;k<old.length;k++)
		{
			vocal = old[k] =='a' || old[k] =='e' || old[k] =='i' || old[k] =='o' || old[k] =='u';

				if (vocal)
				{
					newchars[j]=old[k];
					newchars[j+1]='b';
					newchars[j+2]=old[k];
					j=j+2;
				}
				newchars[j]=old[k];
			j=j+1;
		}
		st=String.valueOf(newchars);
		System.out.println(st);
	}
}
