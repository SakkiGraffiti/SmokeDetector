package smokeSensor;

public class smokeDetector {
	
	private Room rooms[] = new Room[3];
	private float threshold;
	private int noOfRooms = 0;
	private int maxRooms = rooms.length; //store the maximum amount of elements of the array in variable
	
	
	public smokeDetector() {
		super();
	}
				
	public smokeDetector(float threshold) {
		super();
		this.threshold = threshold;
	}

	public Room[] getRooms() {
		return rooms;
	}
		
	public float getThreshold() {
		return threshold;
	}
	
	public void setThreshold(float threshold) {
		this.threshold = threshold;
	}
	
	public int getRoomCount() {
		return noOfRooms;
	}
	
	public boolean addRoomToBeMonitored(Room rm) {
	 
		if(getRoomCount() < maxRooms) {
			rooms[noOfRooms] = rm;
			noOfRooms++;
			return true;
		}
		else
		{
			System.out.println("Can only monitor a maximum of" + maxRooms + "rooms");
			return false;
		}
			
	}
	
	public boolean checkAlarm (float smokeLevel) {
		
		if(smokeLevel > threshold ) {
			System.out.println(getRoomCount() + " rooms are at risk:");
			for(int i=0; i < getRoomCount(); i++) {
				
				System.out.println("\t"+rooms[i].display() ); //Note you cannot use println to call a void method.Hence string method created.
			}
			System.out.println("\n");
		return true;
		}
		else
		{
			System.out.println(getRoomCount() + " rooms are safe");
			System.out.println("\n");
			return false;
		}
	}

}
