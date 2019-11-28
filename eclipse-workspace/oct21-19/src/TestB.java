
public class TestB {

	public static void main(String[] args) {
		
		Cow c=new Cow();
		
		c.Name="Ganga";
		c.color="pink";
		
		System.out.println("Cow name is"+c.Name);
		System.out.println("Cow color is "+c.color);
		c.Eat();
		c.slepp();
		
		System.out.println("*******************************************");
		
		Cow c1 = new Cow();
		
		c1.Name="tunga";
		c1.color="white";
		
		System.out.println("Cow name is"+c1.Name);
		System.out.println("Cow color is "+c1.color);
		c1.Eat();
		c1.slepp();

	}

}
