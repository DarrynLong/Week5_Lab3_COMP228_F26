package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Parent Person Class
 * This is the super class
 */


public class Person {

	// Declaration of attributes
	protected int personID;
	protected String name;
	protected byte age;
	
	// Person Constructor
	public Person(int personID, String name, byte age)
	{
		// Try person ID
		try 
		{
			if (personID < 1)
			{
				throw new IllegalArgumentException("ID must be greater than 0."); 
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
		}
		
		// Try Name
		try 
		{
			if (name.isEmpty())
			{
				throw new IllegalArgumentException("Name cannot be empty."); 
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
		}
		
		// Try age
		try
		{
			if (age < 1 || age > 100)
			{
				throw new IllegalArgumentException("Age cannot be less than 1 or greater than 100."); 
			}
		}
		catch (Exception e) 
		{
			System.out.println("Exception: " + e.getMessage());
		}
		
		this.personID = personID;
		this.name = name;
		this.age = age;
	}
	
	
	// Display Details
	public void displayInfo()
	{
		String className = this.getClass().getSimpleName();	
		System.out.printf("\n----- %s -----\n", className);
		System.out.printf("ID : %d\nName: %s\nAge: %d\n", personID, name, age);
		
	}
	
	// Perform Duties Method
	public void performDuties()
	{
		System.out.println();
		System.out.printf("My name is %s.\n", name);
		System.out.println("I'm busy performing my hospital duties.");
		
	}
}
