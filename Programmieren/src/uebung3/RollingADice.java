package uebung3;

public class RollingADice 
{
	public static void main(String[] args)
	{
		int dice = (int) (Math.random()*6+1);
		if (dice==1)
		{
		System.out.println("You rolled a one");
		}
		if (dice==2)
		{
			System.out.println("You rolled a two");
		}
		if (dice==3)
		{
			System.out.println("You rolled a three");
		}
		if (dice==4)
		{
			System.out.println("You rolled a four");
		}
		if (dice==5)
		{
			System.out.println("You rolled a five");
		}
		if (dice==6)
		{
			System.out.println("You rolled a six");
		}
	}
}
