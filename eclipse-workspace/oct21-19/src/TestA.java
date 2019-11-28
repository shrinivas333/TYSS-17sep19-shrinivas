
public class TestA {

	public static void main(String[] args) {

		Pen p =new Pen();

		p.cost=100;
		p.color="black";
		p.brand="Reynolds";

		System.out.println("pen Cost is "+p.cost);
		System.out.println("pen Color is "+p.color);
		System.out.println("pen Brand is "+p.brand);
		p.write();

		System.out.println("************************************************");

		Van v = new Van();
		v.cost=1200;
		v.color="yellow";

		System.out.println("van price is"+v.cost);
		System.out.println("van color is"+v.color);
		v.move();
		
		
		System.out.println("************************************************");

		Van v1 = new Van();
		v1.cost=15000;
		v1.color="red";

		System.out.println("van price is"+v1.cost);
		System.out.println("van color is"+v1.color);
		v.move();
		

		System.out.println("************************************************");

		
		
	}

}
