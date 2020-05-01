package exe01;
import java.util.Scanner;
import java.util.Arrays;
public class Hangman 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String[] words =new String[20];
		int randomWord =(int)(Math.random()*words.length);
		String word =word(randomWord,words).toUpperCase();
		char [] wordguessed=new char[word.length()];
		Arrays.fill(wordguessed, '_');
		int trys=1;
		String guess=String.valueOf(wordguessed);
		boolean solved=false;

		while ( !solved && trys<=15)
		{ 
			System.out.print("Try "+trys+" : ");
			for(int j =0;j<word.length();j++)
			{
				System.out.print(wordguessed[j]+" ");
			}

			String input= sc.nextLine();
			input=input.toUpperCase();
			for(int i =0;i<word.length();i++)
			{
				char c =input.charAt(0);
				if(c == word.charAt(i))
				{
					wordguessed[i]=c;
				}
			}
			guess=String.valueOf(wordguessed);
			if(guess.equals(word))
			{
				solved = true;
			}
				trys++;
		}	
		if(solved) 
		{
		System.out.println("Congratulations you won! :)");	
		}
		else
		{
			System.out.println("You ran out of trys. Better Luck next Time");
		}
		sc.close();
	}
	
	

	// just a list of words
	public static String word(int x ,String[] words)
	{
		
		words[0]="apple";
		words[1]="counterfeit";
		words[2]="murder";
		words[3]="steal";
		words[4]="rob";
		words[5]="hack";
		words[6]="potassium cyanide";
		words[7]="tomato";
		words[8]="orange";
		words[9]="mask";
		words[10]="rubber";
		words[11]="bookworm";
		words[12]="developer";
		words[13]="user";
		words[14]="data center";
		words[15]="christmas";
		words[16]="holiday";
		words[17]="break";
		words[18]="car";
		words[19]="accident";
		return (words[x]);
	}
}
