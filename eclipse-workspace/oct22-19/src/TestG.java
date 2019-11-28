 class A{
	
}



public class TestG {
	
	static void add() {
		System.out.println("add()");
	}
	final void add(int a) {
		System.out.println("add(int a)");
	}

	public static void main(String[] args) {
		Superclass s1=new Superclass();
		System.out.println("************************");
		Subclass sub =new Subclass();
		sub.getSData();
	}
}
