
public class MainClass {
	//tis is a static method
	public static void main(String[] args) {
		Person p1 =new Person(1);
		Person p2 =new Person(2);
		Concrete1 c1 = new Concrete1(p1);
		Concrete2 c2 = new Concrete2(p2);
	}
}
