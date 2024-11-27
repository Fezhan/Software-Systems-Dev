import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Census extends FormatCheckers{
	private List<Person> people = new ArrayList<Person>();
	
	public Census() {}
	
	private int getDetails(Scanner scan, String parameter) {
        System.out.println("Which attribute would you like to choose:\n\t- (1) height\n\t- (2) age\n\t- (3) gender");
        try {
            int option = Integer.parseInt(scan.nextLine());
            if (option >= 1 && option <= 3) {
                return option;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                return 0;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
            return 0;
        }
    }	
	
	
	public void addPerson(Person person) {
		this.people.add(person);
	}
	
	private boolean removePerson(Person person) {
		if (this.people.contains(person)) {
			this.people.remove(person);
			return true;
		}
		
		return false;
	}
	
	private int countPeople() {
		return this.people.size();
	}
	
	private int countMales() {
		int total = 0;
		for (Person person : this.people) {
			if (person.getGender().toLowerCase().equals("male")) {
				total++;
			}
		}
		
		return total;
	}
	
	private int countFemales() {
		int total = 0;
		for (Person person : this.people) {
			if (person.getGender().toLowerCase().equals("female")) {
				total++;
			}
		}
		
		return total;
	}
	
	
	@Override
	public String toString() {
		String toReturn = "";
		for (Person person : this.people) {
			toReturn = toReturn + person + "\n";
		}
		
		return toReturn;
	}
}
