package lecture04;

public class TemperatureTable 
{
	public static void main(String[] args)
	{
		System.out.println("Fahrenheit\tCelsius");
		for (int fahrenheit=0;fahrenheit<=300;fahrenheit++)
		{
			System.out.print(fahrenheit+"\t\t");
			System.out.printf("%.2f%n", (5.0f/9)*(fahrenheit-32));
			
		}
		
	}
}
