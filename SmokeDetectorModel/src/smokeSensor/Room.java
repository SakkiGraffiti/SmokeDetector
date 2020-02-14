package smokeSensor;

public class Room {
	
	private String name;
	private int capacity;
	
	
	//default constructor
	public Room() {
		super();
	}
	
	//primary constructor
	public Room(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	
	//copy constructor
	
	public Room(Room rm) {
		this.name = rm.name;
		this.capacity = rm.capacity;
	}
		
	//accessors and mutators
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
		
	public String display() {
		return "Room [name=" + name + ", capacity=" + capacity + "]";
	}

}
