package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Grand Parent Person Class
 * Parent Doctor Class
 * Grand child class
 */

public class Surgeon extends Doctor{

	// Declaration of attributes
	private String surgeryType;
	private int operatingRoom;
	
	// Constructor
	public Surgeon(int personID, String name, byte age, String specialization, double consultationFee, String surgeryType, int operatingRoom)
	{
		super(personID, name, age, specialization, consultationFee);
		
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	
	// Perform Surgery Method
	public void performSurgery()
	{
		System.out.println("I'm preparing to perform " + surgeryType + " surgery.");
	}
	
	// Override Perform Duties
	@Override
	public void performDuties()
	{
		super.performDuties();
		System.out.println("I perform the surgeries in operating room " + operatingRoom + ".");
	}
}
