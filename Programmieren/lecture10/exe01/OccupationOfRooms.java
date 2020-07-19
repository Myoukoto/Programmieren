package exe01;

public class OccupationOfRooms 
{
public static void main(String[] args)
	{
		Room rooms = new Room("I.2.15",50,0);
		int student;
		int numberOfStudents= (int)(Math.random()*rooms.getMaxStudents()-1);
		for(int i =0; i<=numberOfStudents;i++)
		{
			student = (int)(Math.random()*100000);
			rooms.enterRoom(student);
		}

		for(int i =0; i<=numberOfStudents;i++)
		{
		System.out.println(rooms.studentList()[i]);
		}
		for(int i =0; i<=numberOfStudents;i++) 
		{
			rooms.leaveRoom(i);
		}
	}
}
