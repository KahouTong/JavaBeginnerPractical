package day3;

class Room{
	String roomName;
	static int roomNumber;	
	
	Room (){
		
	}
	Room(String name, int number)
	{  
		roomName = name;
		roomNumber = number;
	}  
	void display (){
		System.out.println(roomName+" "+roomNumber);}  
}

public class Hostel {
	public static void main (String args[]) {
		Room room = new Room("Garden",12345);
		room.display();
		Room.roomNumber =45678 ;  //directly accessible by class name
		room.roomName = "Alpha";  //only accessible by class instance
		room.display();
		//Room myroom = new Room();
		System.out.println(Room.roomNumber);
	}
}
