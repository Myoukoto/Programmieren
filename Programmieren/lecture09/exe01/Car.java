package exe01;

public class Car
{
	String brand;
	int engineSize;
	String color;
	int maxVelocity;
	String model;

	public Car(String brand, String color, String model, int maxVelocity, int engineSize)
	{
		if (engineSize<=0)
		{
			engineSize=1600;
		}
		this.model=model;
		this.brand=brand;
		this.color=color;
		this.engineSize=engineSize;
		this.maxVelocity=maxVelocity;

	
	}
	public void setEngineSize(int engineSize)
		{
		if (engineSize<=1600) 
		{
			
		}
			this.engineSize=engineSize;
		}
	public int getEngineSize() {
		return engineSize;
	}
}