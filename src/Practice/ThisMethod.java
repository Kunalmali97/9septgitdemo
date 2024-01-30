package Practice;

public class ThisMethod {

	int i=10; //global or non-static variable
	
	public void m1()
	{
		int i=20;  //local variable
		System.out.println(i);
		System.out.println(this.i); //accessing non-static variable
	}
	
	public void m2() {
		m1();
		int j=23;
		System.out.println(j);
	}
	public static void main(String[] args) {
		ThisMethod ab = new ThisMethod();
//		ab.m1();
		ab.m2();
		Syste.out.println("***********");
	}
}
