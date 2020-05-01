package exe05;

public class AttributesCar
{
	public static void main(String[] args)
	{
		Car MiniPaceman=new Car();
		MiniPaceman.brand="Mini";
		MiniPaceman.color="Blue";
		MiniPaceman.engineSize=1598;
		MiniPaceman.maxVelocity=192;
		Car CClassCoupe=new Car();
		CClassCoupe.brand="Mercedes";
		CClassCoupe.color="Black";
		CClassCoupe.engineSize=2143;
		CClassCoupe.maxVelocity=232;
		Car Fiat500=new Car();
		Fiat500.brand="Fiat";
		Fiat500.maxVelocity=160;
		Fiat500.color="white";
		Fiat500.engineSize=1242;
		
		if (MiniPaceman.engineSize>CClassCoupe.engineSize) 
		{
			if (MiniPaceman.engineSize>Fiat500.engineSize)
			{
				System.out.println("Minipaceman has the biggest engine size");
			}
		}
		else if (CClassCoupe.engineSize>Fiat500.engineSize)
		{
			System.out.println("C Class Coupe has the biggeste engine size");
		}
		else 
		{
			System.out.println("Fiat 500 has the biggest engine");
		}
	}
}
