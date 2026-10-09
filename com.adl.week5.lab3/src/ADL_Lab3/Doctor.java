package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Parent Person Class
 * This is the 1st child class
 */


public class Doctor extends Person{

	// Declaration of attributes
	protected String specialization;
	protected double consultationFee;
	
	// Constructor
	public Doctor(int personID, String name, byte age, String specialization, double consultationFee)
	{
		super(personID, name, age);
				
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	
	// Diagnose Patient Method
	public void diagnosePatient()
	{
		System.out.println("It appears the patient is ill.");
	}
	
	// Override Perform Duties
	@Override
	public void performDuties()
	{
		super.performDuties();
		String className = this.getClass().getSimpleName();		
		System.out.println("I'm a " + className + ", my speciality is " + specialization + ".");
	}
}
