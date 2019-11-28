
public class TestB {
	static int a=25;
	int x;
	public static void add() {
		final int a=10;
		//only final access modifier is supported for local modifier.
		int b=20;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		add();
		TestB t=new TestB();
		System.out.println("x value is : "+t.x);
		System.out.println(a);
	}
}
