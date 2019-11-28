
 class Subclass extends Superclass{
	
	String s="subclass variable";
	
	public Subclass() {
	super();
		System.out.println("Sub class Constructor");
	}
	
 void getSData() {
		System.out.println(super.s);
		System.out.println(this.s);
		super.get();
		get();
	}
}
