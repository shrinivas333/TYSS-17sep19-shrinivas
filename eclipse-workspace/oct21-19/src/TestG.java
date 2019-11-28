
public class TestG {

	public static void main(String[] args) {
		Firstgen f=new Firstgen();
		f.msg();
		f.call();
		System.out.println("*************************");

		Secondgen s=new Secondgen();
		s.call();
		s.games();
		s.msg();
		System.out.println("*************************");
		Thirdgen th=new Thirdgen();
		th.call();
		th.msg();
		th.games();
		th.camera();
	}
}
