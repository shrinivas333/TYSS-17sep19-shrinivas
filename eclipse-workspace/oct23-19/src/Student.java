
public class Student {
	String name;
	int rollno;
	final String cname="Qspider";
	final int cid;
	public Student() {
		this.cid = 0;
		// TODO Auto-generated constructor stub
	}
	Student(String name,int rollno,int cid){
		
		this.name=name;
		this.rollno=rollno;
		this.cid=cid;
	}
	final void printdetails() {
		System.out.println("Hi "+name+" welcome to "+cname);
	}
	final void printdetails(String name) {
		System.out.println("Hi "+name+" welcome to "+cname);
	}
}
