
public class TestH {
	public static void main(String[] args) {
		Animal a= new Animal();
		a.eat();
		System.out.println("*************************");
		
		Lion l=new Lion();
		l.eat();
		l.roar();	
		System.out.println("*************************");
		
		Dog g= new Dog();
		g.eat();
		g.bark();
	}


}
