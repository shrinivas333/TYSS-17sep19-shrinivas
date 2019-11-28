
public class Employee {
	String name;
	int eid;
	public Employee(String ename, int Eeid) {
		name=ename;
		eid=Eeid;
	}
	
	void printdetails() {
		System.out.println("Employee name :"+name);
		System.out.println("Employee eid :"+eid);
	}
	public static void main(String[] args) {
		
			Employee e1=new Employee("Rashmika",143);
			e1.printdetails();
		
			Employee e2=new Employee("manasi",69);
			e2.printdetails();
			
			Employee e3=new Employee("chacha",55);
			e3.printdetails();
		
	}
}
