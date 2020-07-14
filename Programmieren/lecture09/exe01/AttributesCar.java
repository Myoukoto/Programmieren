package exe01;

public class AttributesCar
{
	public static void main(String[] args)
	{
		final int numberOfCars=3;
		int maxEngineSize=0;
		Car[] cars = new Car[numberOfCars];
		cars[0] = new Car("C-ClassCoupe 300","Mercedes","Blue",250,1991);
		cars[1] = new Car("Mini Couper S","Mini","Red",233,1998);
		cars[2] = new Car("BMW 318i Touring","BMW","Black",220,1995);
		for(int i=0;i<cars.length;i++)
		{
			if (cars[i].engineSize>maxEngineSize)
			{
				maxEngineSize=cars[i].engineSize;
			}
		}
		System.out.println("The biggest engine Size of these models is: "+maxEngineSize);
	}
}
