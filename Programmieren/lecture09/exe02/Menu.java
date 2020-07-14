package exe02;

public class Menu 
{
	public static void main(String[] args)
	{
		final int numberOfPizzas=5;
		Pizza[] pizzas = new Pizza[numberOfPizzas];
		pizzas[0]=new Pizza("Pizza Ananas",26,4.5f);
		pizzas[1]=new Pizza("Pizza Sucuk",26,4.5f);
		pizzas[2]=new Pizza("Pizza Pollo",26,4.5f);
		pizzas[3]=new Pizza("Pizza Sardelle",26,4.5f);
		pizzas[4]=new Pizza("Pizza Spinaci",26,4.5f);
		int longestName = 0;
		for (int i=0; i<pizzas.length;i++) 
		{
			int currentPizza =pizzas[i].getName().length();
			if (currentPizza>longestName) 
			{
				longestName=currentPizza;
			}
		}
			int lengthOfDiameter = "Diameter".length();
			int lengthOfPrice = "Price in EUR".length();
		for (int i = 0; i<pizzas.length;i++ )
		{
			System.out.printf(pizzas[i].getName());
			int numberOfSpaces=longestName-pizzas[i].getName().length()+5;
			System.out.printf("%"+numberOfSpaces+"s","");
			numberOfSpaces=lengthOfDiameter-2;
			System.out.printf("%"+numberOfSpaces+"dcm",pizzas[i].getDiameter());
			numberOfSpaces=lengthOfPrice+5;			
			System.out.printf("%"+numberOfSpaces+".2f",pizzas[i].getPrice());
			System.out.println();
		}
	}
}

