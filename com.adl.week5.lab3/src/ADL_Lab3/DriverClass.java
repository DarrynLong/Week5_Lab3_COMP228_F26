package ADL_Lab3;

/**
 * @author Darryn
 * @since 10/07/2026
 * Demonstrating Inheritance 
 */

public class DriverClass {

	public static void main(String[] args) {
		
		
		// Beginning Message
		System.out.println("=======================================");
		System.out.println("           Hospitial Staff");
		System.out.println("=======================================");
		
		// Person
		Person p = new Person(0, "Alice",(byte)0);
		p.displayInfo();
		p.performDuties();
		
		// Doctor
		Doctor d = new Doctor(102, "Dr.Falen", (byte)45, "Neurology", 1000);
		d.displayInfo();
		d.performDuties();
		d.diagnosePatient();
		
		
		//Nurse
		Nurse n = new Nurse(103, "Laura", (byte)24, "Emergency", 8);
		n.displayInfo();
		n.performDuties();
		n.assistPatient();
		
		
		//Surgeon
		Surgeon s = new Surgeon(104, "Dr.Barnwall",(byte)57, "Cardiology", 3000, "heart", 450);
		s.displayInfo();
		s.performDuties();
		s.diagnosePatient();
		s.performSurgery();
		
		
		//EmergencyDoctor
		EmergencyDoctor ed = new EmergencyDoctor(105, "Dr.Morris", (byte)45, "Truma", 500);
		ed.displayInfo();
		ed.performDuties();
		ed.diagnosePatient();
		ed.handleEmergency();
		ed.prescribeMedication();
		ed.generateBill();
		
		
		//====================================
		// Creating one object variable
		// Type casting down
		//====================================
		
		// Person
		Person person = new Person(106, "John",(byte)29);
		person.displayInfo();
		person.performDuties();
		
		// Person as Doctor
		person = new Doctor(106, "John",(byte)29, "Neurology", 1000);
		((Doctor) person).performDuties();
		((Doctor) person).diagnosePatient();
		
				
		// Person as Nurse
		person = new Nurse(106, "John",(byte)29, "Emergency", 8);
		((Nurse) person).performDuties();
		((Nurse) person).assistPatient();
			
				
		// Person as Surgeon
		person = new Surgeon(106, "John",(byte)29, "Cardiology", 3000, "heart", 450);
		((Surgeon) person).performDuties();
		((Surgeon) person).diagnosePatient();
		((Surgeon) person).performSurgery();
				
				
		// Person as EmergencyDoctor
		person = new EmergencyDoctor(106, "John",(byte)29, "Truma", 500);
		((EmergencyDoctor) person).performDuties();
		((EmergencyDoctor) person).diagnosePatient();
		((EmergencyDoctor) person).handleEmergency();
		((EmergencyDoctor) person).prescribeMedication();
		((EmergencyDoctor) person).generateBill();
		
		
	}

}
