package fundamentals;

class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

public class FormalParameterPersonClass {

	public static void swap(Person p1, Person p2) {
		Person t;
		
		t = p1;
		p1 = p2;
		p2 = t;
		
	}
	
	public static void rename(Person person) {
		person.setName("?");
	}
	
	public static void main(String[] args) {
		Person jane = new Person("Jane");
		Person john = new Person("John");
		
		System.out.println("Object jane name is " + jane.getName());
		System.out.println("Object john name is " + john.getName());
		
		System.out.println("swap(jane, john)");
		
		swap(jane, john); // Person objects are not swapped! The address (reference) of the object is passed by value
		
		System.out.println("Object jane name is " + jane.getName());
		System.out.println("Object john name is " + john.getName());
		
		System.out.println("rename(john)");
		
		rename(john); // The object reference is passed as a value the formal parameter person points to john object, so it is changed!
		
		System.out.println("Object jane name is " + jane.getName());
		System.out.println("Object john name is " + john.getName());
				
	}

}
