package exe01;

public class Room 
{
	private int maxStudents;
	private  String roomID;
	private int currentStudents;
	public int[] students;
	public Room(String roomID, int maxStudents, int currentStudents) 
	{
		this.roomID=roomID;
		this.maxStudents=maxStudents;
		this.currentStudents=currentStudents;
		students=new int[maxStudents];
	 }
		
	public void setCurrentStudents(int currentStudents)
	{
		this.currentStudents=currentStudents;
	}
	public String getRoomID()
	{
	return roomID;	
	}
	public int getMaxStudents() 
	{
	return maxStudents;	
	}
	
	public void enterRoom(int studentnumber) 
	{
		if (currentStudents<maxStudents) 
		{
	
		students[currentStudents]=studentnumber;
		currentStudents++;
		}
	}
	public void leaveRoom(int studentnumber) 
	{
		{
		students[studentnumber]=0;
		currentStudents--;	
		}
	}
	public int[] studentList()
	{
		return students;
	}
}
