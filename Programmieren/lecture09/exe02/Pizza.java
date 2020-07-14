package exe02;

public class Pizza 
{
	String name;
	int diameter;
	float price;
	float[] differingprice;
	int[] differingdiameter;
	
	public Pizza(int[]differingdiameter, float[] differingprice, String name) {
		this.differingprice=differingprice;
		this.name=name;
		this.differingdiameter=differingdiameter;
	}

	public Pizza(String name, int diameter, float price)
	{
	this.name=name;
	this.diameter=diameter;
	this.price=price;
	}

	public float getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}

