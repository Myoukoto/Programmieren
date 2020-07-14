package exe03;

public class Room 
{
	private int maxStudents;
	private  String roomID;
	private int currentStudents;
	 public Room(String roomID, int maxStudents, int currentStudents) 
	 {
		this.roomID=roomID;
		this.maxStudents=maxStudents;
		this.currentStudents=currentStudents;
	 }
	
	public void setCurrentStudents(int currentStudents)
	{
		this.currentStudents=currentStudents;
	}
	public String getRoomID()
	{
	return roomID;	
	}
	public boolean checkOccupancy() {
		boolean full=false;
		if (maxStudents<=currentStudents)
		{
			full=true;
		}
		return full;
	}
}
