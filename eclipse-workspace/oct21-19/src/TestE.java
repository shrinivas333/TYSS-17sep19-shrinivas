
public class TestE {

	public static void main(String[] args) {
		Student.CollegeName="Jsp";
		Student s =new Student();
		s.name="suprith";
		s.USN=101;
		System.out.println("College Name :"+Student.CollegeName);
		System.out.println("Name is : "+s.name);
		System.out.println("USN is : "+s.USN);
		s.read(); 
		
		
	}
}
