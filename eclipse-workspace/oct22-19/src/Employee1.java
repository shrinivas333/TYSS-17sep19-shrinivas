
public class Employee1 {

	String name;
	int eid;
	public Employee1(String name, int eid) {
		this.name=name;
		this.eid=eid;
	}
	
	void printdetails() {
		System.out.println("Employee name :"+name);
		System.out.println("Employee eid :"+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to TEST YANTRA");
	}
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1("Rashmika",143);
		e1.printdetails();
	
		Employee1 e2=new Employee1("manasi",69);
		e2.printdetails();
		
		Employee1 e3=new Employee1("chacha",55);
		e3.printdetails();
	}
}
