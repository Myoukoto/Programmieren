package exe03;

public class OccupancyOfSpace 
{
	public static void main(String[]args) 
	{
	final int numberOfRooms =2;
	Room[] rooms= new Room[numberOfRooms];
	rooms[0]=new Room ("I.2.1",50,5);
	rooms[1]=new Room ("I.2.15",20,0);
	for (int i =0;i<rooms.length;i++)
	{
		if (rooms[i].checkOccupancy()==true) 
		{
			System.out.println(rooms[i].getRoomID() +" is full");
		}
		else
		{
			System.out.println(rooms[i].getRoomID()+ " still has room for more Students");
		}
	}
	rooms[0].setCurrentStudents(51);
	for (int i =0;i<rooms.length;i++)
	{
		if (rooms[i].checkOccupancy()==true) 
		{
			System.out.println(rooms[i].getRoomID() +" is full");
		}
		else
		{
			System.out.println(rooms[i].getRoomID()+ " still has room for more Students");
		}
	}
	}
}
