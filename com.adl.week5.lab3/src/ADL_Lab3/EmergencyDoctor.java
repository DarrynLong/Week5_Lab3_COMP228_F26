package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Grand Parent Person Class
 * Parent Doctor Class
 * Grand child class
 * Implements Interfaces
 */

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable{

		
	// Constructor
	public EmergencyDoctor(int personID, String name, byte age, String specialization, double consultationFee)
	{
		super(personID, name, age, specialization, consultationFee);
	}
		
	
	// Implementing Medical Professional
	@Override
	public void prescribeMedication()
	{
		System.out.println("I'm going to prescribe you this, it should help with the pain.");
	}
	
	// Implementing Bill-able
	@Override
	public void generateBill()
	{
		System.out.println();
		System.out.println("------ BILL -------");
		System.out.printf(" COST - $%.2f\n", consultationFee);
		System.out.println("-------------------");
	}
		
	// Handle Emergency Method
	public void handleEmergency() 
	{
		System.out.println("I'll apply a tourniquet stat!");
	}
	
	// Override Perform Duties
	@Override
	public void performDuties()
	{
		super.performDuties();
		System.out.println("I take care of emergency patients.");
	}
	
}
