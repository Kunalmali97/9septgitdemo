package Practice;

public class CallingMethods {

	public static void a1() {
		CallingMethods b =new CallingMethods();
		b.a2(); // calling non-staic method into static class
		System.out.println("a1 method");
	}
	
	public void a2() {
//		a1();
		System.out.println("a2 method");
	}
	
	public static void main(String[] args) {
		a1();
//		CallingMethods b =new CallingMethods();
//		b.a2();
	}
}
