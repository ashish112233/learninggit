
public abstract class AbstractClass {
	private final Person person;
	public AbstractClass(Person person){
		this.person = new Person(25);
		System.out.println("Person's age: " + this.person);
		System.out.println("Passed Person's age: "+ person.getAge());
	}
}
