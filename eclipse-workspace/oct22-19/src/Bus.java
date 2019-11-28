
public class Bus {

	int seats;
	String color;

	public Bus(int seats ,String color) {
		this.seats=seats;
		this.color=color;
	}
	public Bus() {
		this(40);
	}
	public Bus(int seats) {
		this(seats,"red");

	}
	void printdetails() {
		
		System.out.println("Welcome to Red Bus ,Seat Capacity is :"+seats);
		
	}
}
