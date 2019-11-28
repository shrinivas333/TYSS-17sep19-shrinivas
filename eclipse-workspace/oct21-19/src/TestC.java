
public class TestC {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.name="sangliyana";
		Person.color="brown";
		p.age=20;
		
		p.eat();
		p.walk();
		Person.sleep();
		System.out.println("person color is="+Person.color);
		System.out.println("person name is="+p.name);
		System.out.println("person age is="+p.age);
		Person.sleep();
		
		System.out.println("**********************************");
		
		Person p1 = new Person();
		p1.name="uncle";
		Person.color="blaCK";
		p1.age=30;
		
		p1.eat();
		p1.walk();
		Person.sleep();
		System.out.println("person color is="+Person.color);
		System.out.println("person name is="+p1.name);
		System.out.println("person age is="+p1.age);
		Person.sleep();
	}

}
