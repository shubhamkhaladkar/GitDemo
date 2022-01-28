package basics;

public class Javasample1 {

	public void dec() {
		System.out.println("Dec method is running");
	}

	public String dec1() {
		String tr = "Dec1 method is running..";
		return tr;
		

	}

	public void dec2(String rv) {
		System.out.println(rv);
	}

	public static void main(String[] args) {

		Javasample1 js1 = new Javasample1();

		js1.dec();

		String ref = js1.dec1();
		
		System.out.println(ref);

		js1.dec2("Dec2 method is running..");
	}

}
