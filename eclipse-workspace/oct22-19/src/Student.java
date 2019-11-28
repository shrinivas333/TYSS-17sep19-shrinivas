
public class Student {
	String name;
	int age;
	long USN;
	String Branch;
	long pno;
	
	public Student(String name,int age,long USN,String Branch,long pno) {
		this.name=name;
		this.age=age;
		this.USN=USN;
		this.Branch=Branch;
		this.pno=pno;
		
	}
	void printdetails() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("USN="+USN);
		System.out.println("Branch="+Branch);
		System.out.println("Phone No="+pno);
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student("Ravi", 18, 1, "CS",1234566);
		s1.printdetails();
		System.out.println("********************************");
		Student s2=new Student("Raju", 18, 2, "CS",56664566);
		s2.printdetails();

		System.out.println("********************************");
		Student s3=new Student("Nischal", 18, 3, "CS",16554566);
		s3.printdetails();

		System.out.println("********************************");
		Student s4=new Student("Santosh", 18, 4, "CS",78994566);
		s4.printdetails();

		System.out.println("********************************");
		Student s5=new Student("Suraj", 18, 5, "CS",1234566);
		s5.printdetails();

		System.out.println("********************************");
		Student s6=new Student("Ravi", 18, 6, "CS",789465222);
		s6.printdetails();

		System.out.println("********************************");
		Student s7=new Student("Supreeth", 18, 7, "CS",754613254);
		s7.printdetails();

		System.out.println("********************************");
		Student s8=new Student("Pratik", 18, 8, "CS",1234566);
		s8.printdetails();

		System.out.println("********************************");
		Student s9=new Student("Shrinivas", 18, 9, "CS",1234566);
		s9.printdetails();

		System.out.println("********************************");
		Student s10=new Student("Jagga", 18, 10, "CS",1234566);
		s10.printdetails();

		System.out.println("********************************");
	}
}
