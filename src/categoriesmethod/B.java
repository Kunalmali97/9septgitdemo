package categoriesmethod;

public class B {

	public static String m1() {
		System.out.println("welcome");
		return "hii";
		
	}
	
	public int m2() {
		
		System.out.println("method  with return and no argument");
		
		return 70;
		
	}
	
	public static void main(String[] args) {
		B b = new B();
		m1();
		int var=b.m2();
		System.out.println(var);
		int y = var+2;
		System.out.println(y);
	}
}
