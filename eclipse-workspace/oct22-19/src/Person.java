
public class Person {
	String name;
	int age;
	
	public Person(String pname ,int page) {
		pname=name;
		page=age;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Person p= new Person("Rachel", 25);
		Person p1= new Person("Joe", 35);
		Person p2= new Person("chandler", 45);
		
		
		System.out.println("main method ended");
	}
	
}
