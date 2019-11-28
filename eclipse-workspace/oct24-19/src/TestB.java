
public class TestB {

	static int a;
	int b;
	{
		a=10;
		b=20;
		System.out.println("instance block1");
	}
	public static void main(String[] args) {
		
		System.out.println("Main startd");
		TestB b= new TestB();
		TestB b1= new TestB();
		System.out.println("Main ended");
	}
	{
		System.out.println("Instance block2");
	}
}
