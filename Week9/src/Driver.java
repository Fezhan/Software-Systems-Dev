
public class Driver {
	public static void main(String[] args) {
		Person person = new Person(180, 42, "male");
		//person.optionGetter();
		//person.optionSetter();
		//System.out.println(person.toString());
		
		Census census = new Census();
		
		census.addPerson(new Person(50,3,"male"));
		census.addPerson(new Person(120,15,"female"));
		census.addPerson(new Person(180,22,"male"));
		
		System.out.println(census.toString());
	}
}
