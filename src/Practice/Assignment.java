package Practice;

public class Assignment {
	
	public void Addition(int a,int b) {
		
		int c= a+b;
		System.out.println(c);
		
	}
public void Subtraction(int a,int b) {
		
		int c= a-b;
		System.out.println(c);
		
	}
public void Multiplication(int a,int b) {
	
	int c= a*b;
	System.out.println(c);
	
}
public void Division(double a,double b) {
	
	double c= a/b;
	System.out.println(c);
	
}
	
	public static void main(String[] args) {
		
		Assignment a = new Assignment();
		a.Addition(12, 20);
		a.Subtraction(15, 10);
		a.Multiplication(8, 9);
		a.Division(4.5, 0.01);
		System.out.println("**************");
	}

}
