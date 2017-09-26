
public class PersonMain {
	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("John", "Doe");
		System.out.println(person.toString());
	}
}