package smokeSensor;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Room lab = new Room(); 
		lab.setName("Lab C");
		lab.setCapacity(23);
		lab.display();
		
		
		
		Room hall = new Room("Conference",100);
		hall.display();
		
		Room bathroom = new Room("Bathroom",5);

		
		smokeDetector smoke = new smokeDetector(50.0F); 
				
		smoke.addRoomToBeMonitored(lab);
		smoke.addRoomToBeMonitored(hall);
		smoke.addRoomToBeMonitored(bathroom);

		smoke.checkAlarm(75.0F);
		smoke.checkAlarm(35.0F);
		smoke.checkAlarm(90.0F);
		

		
	}

}
