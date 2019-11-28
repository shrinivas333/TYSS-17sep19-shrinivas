
public class TestA {

	static int a;
	int b;
	static {
		a=10;
		System.out.println("static block1");
	}
	public TestA() {
		System.out.println("constructor called");
	}
	
	
	public static void main(String[] args) {
		
		TestA t=new TestA();
		TestA t1=new TestA();
		System.out.println("a="+a);
	}
	
	static {
		a=20;
		System.out.println("static block2");
		
	}
	static {
		a=40;
		System.out.println("static block3");
		
	}
}
