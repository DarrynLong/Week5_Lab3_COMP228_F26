package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Parent Person Class
 * This is the 2nd child class
 */

public class Nurse extends Person {
	
	// Declaration of attributes
	private String department;
	private double shift;
	
	// Constructor
	public Nurse(int personID, String name, byte age, String department, double shift)
	{
		super(personID, name, age);
		
		this.department = department;
		this.shift = shift;
	}
	
	
	// Assist Patient Method
	public void assistPatient()
	{
		System.out.println("I'll fetch a cold press and the med kit.");
	}
	
	
	// Override Perform Duties
	@Override
	public void performDuties()
	{
		super.performDuties();
		System.out.println("I'm a Nurse in the " + department + " department, working " + shift + "hour shifts");
	}

}
