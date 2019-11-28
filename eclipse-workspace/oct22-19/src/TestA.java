
public class TestA {

	public static int add(int a ,int b) {
		System.out.println("add(int a, int b) method");
		return a+b;
	}
	
	public static long add(long a ,int b) {
		System.out.println("add(long a, int b) method");
		return a+b;
	}
	
	public  double add(double a ,int b) {
		System.out.println("add(double a, int b) method");
		return a+b;
	}
	
	public static void add(int a ,byte b) {
		System.out.println("add(int a, byte b) method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main(string[] args) method");
		main(10);
		add(5, 2);
		add(40, 5);
		add(80, 20);
		
		TestA t=new TestA();
		t.add(10.5, 10);
	}
	public static void main(int a) {
		
		System.out.println("main(int a) method");

	}

}
